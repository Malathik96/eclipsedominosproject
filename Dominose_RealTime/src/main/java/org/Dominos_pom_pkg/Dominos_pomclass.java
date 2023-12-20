package org.Dominos_pom_pkg;

import org.openqa.selenium.By;

import Dominos_base_pkg.Dominose_baseclass;

public class Dominos_pomclass extends Dominose_baseclass {

	public By online_order = By.xpath("//button[text()='ORDER ONLINE NOW']");

	public By delivery_address = By.xpath("//input[@placeholder='Enter your delivery address']");

	public By enter_area = By.xpath("//input[@placeholder='Enter Area / Locality']");

	public By location = By.xpath("(//div[@class=\"injectStyles-sc-1jy9bcf-0 bLFVnP\"])[1]");

	public By locatemebtn = By.xpath("//button[@data-label='Locate_Me']");
	// public By locatemebtn = By.xpath("(//li[@data-label='location_[object
	// Object]'])[2]");

	public By location_popup = By.xpath("(//button[@class='ng-binding'])[1]");

	public By veg_pizza = By.xpath("//span[text()='VEG PIZZA']");

	public By Margherita = By.xpath("(//div[contains(@data-label,'Margherita')])[2]//span[.='ADD TO CART']");

	public By Margherita_add = By.xpath("//span[text()='ADD']");

	public By Margherita_addqty = By.xpath("//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[3]");

	public By peppy_paneer = By.xpath("//div[contains(@data-label,'Peppy Paneer')])[2]//span[.='ADD TO CART']");

	public By peppy_paneer_add = By.xpath("//button[@data-label='addTocart'])[20]");

	public By peppy_paneer_addqty = By.xpath("//div[@data-label='increase'])[6]");

	public By Beverages = By.xpath("//span[text()='BEVERAGES']");

	public By pepsi475 = By.xpath("//div[contains(@data-label,'Pepsi 475ml')]//span[text()='ADD TO CART']");

	public By pepsi475_addqty = By.xpath("//div[@data-label='increase'])[8]");

	public By remove_MargeritaQty = By.xpath("//div[@data-label=\"decrease\"])[6]");

	public By remove_pepsiqty = By.xpath("//div[@data-label=\"decrease\"])[8]");

	public By checkout = By.xpath("//button[@data-label='miniCartCheckout']");

	public By subtotal = By.xpath("//span[@class='rupee'])[4]");

	public By tax = By.xpath("//span[@class='rupee'])[5]");

	public By placeorder = By.xpath(
			"//div[contains(@class,'txt--wrpr marginTop')]//span[@class='txt--bold txt--bggr sc-kPVwWT dXwbwr']");

	public By grandTotal = By.xpath("//span[@class='rupee'])[6]");

}
