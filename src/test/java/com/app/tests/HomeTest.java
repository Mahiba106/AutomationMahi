package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.pages.BasePage;
import com.app.pages.HomePage;


public class HomeTest {

	HomePage hp;
	BasePage bp;
	
	public HomeTest () {
		hp = new HomePage();
		bp = new BasePage();
		
	}
	
	@Test
	public void verifyTabs() {
		Assert.assertTrue(bp.elementDisplayed(hp.getTabsDisplayed()));
		
	}
	@Test
	public void verifyTabTitle() {
		Assert.assertTrue(bp.elementDisplayed(hp.tabTitle()));
	}
	
	@Test
	public void verifySubscriptionAlert() {
		Assert.assertTrue(bp.elementDisplayed(hp.sendEmail()));
	}
	
	@Test
	public void verifySize() {
		Assert.assertTrue(bp.elementDisplayed(hp.sizeDisplay()));
	}

	}
	

