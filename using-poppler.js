/*const pdf = require('pdf-poppler');
 
let file = '7sempayment.pdf'
 
pdf.info(file)
    .then(pdfinfo => {
        console.log(pdfinfo);
    });
*/
const path = require('path');
const pdf = require('pdf-poppler');
 
let file = '7sempayment.pdf'
 
let opts = {
    format: 'jpeg',
    out_dir: path.dirname(file),
   	out_prefix: path.basename(file, path.extname(file)),
    page: null
}
 
pdf.convert(file, opts)
    .then(res => {
        console.log('Successfully converted');
    })
    .catch(error => {
        console.error(error);
    })