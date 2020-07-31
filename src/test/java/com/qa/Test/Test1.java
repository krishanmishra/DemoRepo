package com.qa.Test;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.qa.Base.BaseTest;
import com.qa.dataProviders.DataProviders;

public class Test1 extends BaseTest {

	@Factory(dataProvider = "Config", dataProviderClass = DataProviders.class)
	public Test1(String browser) {
		super(browser);
	}

	@Test
	public void testFirst() {
		System.out.println("Test First case");
	}

}
