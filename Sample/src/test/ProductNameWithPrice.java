package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class ProductNameWithPrice {

	public static void main(String[] args) {
		Tshirt t = new Tshirt();
		t.execute();

	}

	public void execute() {

		launchBrowser("Chrome");
		driver.get(
				"https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		String Tshirt = "//a[@class='_2mylT6']";
		String value = "//div[@class='_1vC4OE']";

		String text = driver.findElement(By.xpath(Tshirt)).getAttribute("title");
		// System.out.println(text);

		String price = driver.findElement(By.xpath(value)).getText();
		// System.out.println(price);

		List<WebElement> lists = driver.findElements(By.xpath("//a[@class='_2mylT6']"));
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i).getAttribute("title"));

			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j).getText());

				System.out.println(lists.get(i).getAttribute("title") + list.get(j).getText());
			}

		}
	}
}
