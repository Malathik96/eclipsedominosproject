package org.Dominos_stepdef_pkg;

import java.time.Duration;

import org.Dominos_pom_pkg.Dominos_pomclass;

import Dominos_base_pkg.Dominose_baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dominos_stepdefclass extends Dominose_baseclass {

	Dominos_pomclass pom = new Dominos_pomclass();

	@Given("login the url")
	public void login_the_url() {
		driver.get("https://www.dominos.co.in/");
		maximize(driver);

	}

	@When("Click on Order Online")
	public void click_on_order_online() throws InterruptedException {
		driver.findElement(pom.online_order).click();
		Thread.sleep(2000);

	}

	@When("Click on location button and enter the location details")
	public void click_on_location_button_and_enter_the_location_details() throws InterruptedException {
		driver.findElement(pom.delivery_address).click();
		driver.findElement(pom.enter_area).sendKeys("600069");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Thread.sleep(2000);
		driver.findElement(pom.locatemebtn).click();
	}

	@When("To select the veg pizzas and Beverages")
	public void to_select_the_veg_pizzas_and_beverages() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(pom.location_popup).click();
		driver.findElement(pom.veg_pizza).click();
		Thread.sleep(2000);

		driver.findElement(pom.Margherita).click();
		driver.findElement(pom.Margherita_add).click();
		driver.findElement(pom.Margherita_addqty).click();
		Thread.sleep(2000);

		driver.findElement(pom.peppy_paneer).click();
		driver.findElement(pom.peppy_paneer_add).click();
		driver.findElement(pom.peppy_paneer_addqty).click();
		Thread.sleep(2000);

		driver.findElement(pom.Beverages).click();
		Thread.sleep(3000);
		driver.findElement(pom.pepsi475).click();

		for (int i = 0; i < 11; i++) {
			driver.findElement(pom.pepsi475_addqty).click();
			;
		}

	}

	@When("To remove the Qty of the order in the add to cart")
	public void to_remove_the_qty_of_the_order_in_the_add_to_cart() {
		driver.findElement(pom.remove_MargeritaQty).click();

		for (int i = 0; i < 6; i++) {
			driver.findElement(pom.remove_pepsiqty).click();
			;

		}

	}

	@Then("Checkout the order and close?the?window")
	public void checkout_the_order_and_close_the_window() throws InterruptedException {
		driver.findElement(pom.checkout).click();
		Thread.sleep(2000);

		String subtotal = driver.findElement(pom.subtotal).getText();
		double subtl = Double.parseDouble(subtotal);
		System.out.println("subtotal" + subtl);

		String tx = driver.findElement(pom.tax).getText();
		double tax = Double.parseDouble(tx);
		System.out.println("Tax" + tax);

		Thread.sleep(2000);

		double subtotalvalue = Double.parseDouble(String.valueOf(subtl + tax));
		System.out.println("subtotalvalue" + subtotalvalue);

		Thread.sleep(2000);

		String grand = driver.findElement(pom.grandTotal).getText();
		double grandtotal = Double.parseDouble(grand);
		System.out.println("GrandTotal" + grandtotal);

	}

}
