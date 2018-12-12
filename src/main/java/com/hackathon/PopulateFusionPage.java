package com.hackathon;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;

import com.hackathon.forms.DomesticAirTravelForm;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PopulateFusionPage extends BaseSetup {

	/* Form Templates */
	DomesticAirTravelForm datform;

	@Rule
	public TestName name = new TestName();

	@After
	public void tearDown() {
		BaseSetup.driver.quit();
	}

	@Before
	public void loadpages() throws InterruptedException {
		if (BaseSetup.hasQuit) {
			init();
		}
		this.datform = new DomesticAirTravelForm();
	}

	// @Test
	// public void aTestFusionPageLoads() throws InterruptedException {
	// System.out.println("Demo on Google " + this.name.getMethodName());
	// this.datform.clickSearch(this.test, this.message);
	// System.out.println("Test case results" + test);
	// Thread.sleep(5000);
	//
	// }

	@Test
	public void bFillFusionForm() throws InterruptedException {
		System.out.println("We are populating form: " + this.name.getMethodName());
		this.datform.fillForm();
		// this.datform.submit();
		Thread.sleep(5000);
	}

}