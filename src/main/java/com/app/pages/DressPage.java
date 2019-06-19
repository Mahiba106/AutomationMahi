package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class DressPage extends BasePage{
	
	@FindBy(xpath = "//*[@class='layered_filter'][2]//a[contains(@href,'size-s')]")
	private WebElement small;
	
	@FindBy(linkText="//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement headerProdCount;
	
	@FindBys(@FindBy (xpath="//*[@id=\"center_column\"]/ul/li"))
	private WebElement prodContainerCnt;
	
	//@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
	//private WebElement addToCart;
	
	@FindBy(xpath ="//*[@id=\"cart_summary\"]//tbody")
	private WebElement itemInCart;
	
	@FindBy(xpath = "//*[@title=\"Proceed to checkout\"]")
	private WebElement proceedChckOut;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
	private WebElement prdct;
	
	/*public boolean sizeDisplay() {
		return elementDisplayed(small);
	}
	
	public int getHeadProdCnt() {
		return Integer.parseInt(headerProdCount.getText().replaceAll("^[a-zA-Z]", ""));
		
	}
	
	public int getContainerProdCnt() {
		ArrayList<WebElement> prodContainerCnt = new ArrayList<WebElement>();
		return prodContainerCnt.size();
		}
	*/
	

	public String addPrdctToCart() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"))).build().perform();
		String prdctId = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).getAttribute("data-id-product");
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@title=\"Proceed to checkout\"]")).click();
		return prdctId;
		
	}
	
	public String prdctInCart() {
		String cartItem = null;
		WebElement itemInCart = driver.findElement(By.xpath("//*[@id=\"cart_summary\"]//tbody"));
		List<WebElement> tableRows = itemInCart.findElements(By.xpath(".//tr"));
		for(WebElement itembox : tableRows) {
			 tableRows.get(0);
			 cartItem = itembox.getAttribute("id");
	}
		return cartItem;
}

	public boolean matched(String prdctId, String cartItem) {
		boolean res = false;
	
			if(cartItem.contains(prdctId)) {
				return true;
			}else {
				return res;
			}
				
	}
	}
	


	
	

