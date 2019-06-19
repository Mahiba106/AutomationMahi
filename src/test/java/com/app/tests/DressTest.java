package com.app.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.DressPage;
import com.app.pages.HomePage;

public class DressTest {
	
	DressPage dp;
	HomePage hp;
	
	public DressTest() {
		dp = new DressPage();
		hp = new HomePage();
	}
	
/*	@Test
	public void verifySizeDisplay () {
		hp.clickDresses();
		Assert.assertTrue(dp.sizeDisplay(),"Failed");
	}
	
	@Test
	public void verifyPrdCount() {
		hp.clickDresses();
		Assert.assertTrue(dp.getContainerProdCnt()==dp.getHeadProdCnt(), "Failed");
	}*/
	
	@Test
	public void verifyPrdAddedToCart() {
		hp.clickDresses();
		Assert.assertTrue(dp.matched(dp.addPrdctToCart(), dp.prdctInCart()), "Failed");
	}
	

}
