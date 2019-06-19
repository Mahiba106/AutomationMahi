package com.app.pages;


import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement woman;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[1]")
	private WebElement womanHp;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/h1/span[1]")
	private WebElement dressesHp;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement shirts;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[1]")
	private WebElement shirtsHp;
	
	@FindBy(xpath = "//*[@id=\"newsletter-input\"]")
	private WebElement subscriptionBox;
	
	@FindBy(xpath = "//*[@id=\"columns\"]/p")
	private WebElement subscriptionAlert;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement small;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement med;
	
	@FindBy(xpath ="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement large;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement prdCount;
	
	@FindBys(@FindBy(xpath = "//*[@id=\"center_column\"]/ul//img"))
	private WebElement imgCount;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}	
	public WebElement getTabsDisplayed(){
		ArrayList<WebElement> tabList = new ArrayList<WebElement>();
		tabList.add(woman);
		tabList.add(dresses);
		tabList.add(shirts);
		for (WebElement pg:tabList) {
			return pg;
		}
		return null;
	}	
	public WebElement tabTitle() {
		ArrayList<WebElement> tabs = new ArrayList<WebElement>();
		tabs.add(woman);
		tabs.add(dresses);
		tabs.add(shirts);		
		for (WebElement tb:tabs) {
			tb.click();
		}
		ArrayList<WebElement> pages = new ArrayList<WebElement>();
		pages.add(womanHp);
		pages.add(dressesHp);
		pages.add(shirtsHp);
		for(WebElement pg:pages) {
			return pg;
		}
		return null;
	}		
	public WebElement sendEmail() {
		sendText(subscriptionBox, "xyz.msd@gmail.com");
		elementDisplayed(subscriptionAlert);		
		return subscriptionAlert;
	}
	
	public WebElement sizeDisplay() {
		shirts.click();
		ArrayList<WebElement> size = new ArrayList<WebElement>();
		size.add(small);
		size.add(med);
		size.add(large);
		for(WebElement pg:size) {
			return pg;
		}
		return null;
		
	}
	
	public void clickDresses() {
		dresses.click();
	}
	
	}
