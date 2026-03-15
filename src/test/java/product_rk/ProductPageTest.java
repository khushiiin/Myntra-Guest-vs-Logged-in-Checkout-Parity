package product_rk;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class ProductPageTest extends BaseTest {
	private ProductPage product;

	@BeforeClass
	public void initPage() {
		product = new ProductPage(DriverFactory.getDriver());
	}

	@Test(priority = 1)
	public void searchProductTest() {
		String itemName = "Watch";
		product.searchProduct(itemName);
	}

	@Test(priority = 2)
	public void allProductListTest() {
		product.allProductList();
	}

	@Test(priority = 3)
	public void addTocartTest() {
		product.addTocart();
	}
	@Test(priority = 4)
	public void addMultipleProductsTest() {
		String[] products = { "Tv", "Sunglasses", "Wallet" ,"Backpack", "Handbag", "Perfume", "Deodorant","Cap","Belt","Bracelet"};
		for (String item : products) {
			product.searchProduct(item);
			product.allProductList();
			product.addTocart();
		}
	}

	@Test(priority = 6)
	public void openBagTest() {
		product.openBag();
	}

	@Test(priority = 5)
	public void refreshCartPageTest() {
		product.refreshCartPage();
	}
	
	@Test(priority = 7)
	public void findTotalAmountTest() {
		product.findTotalAmount();;
	}
	
	/*-----------Negative Test Cases-----------*/
	@Test(priority = 8)
	public void openBagWithoutLoginTest() {
		product.visitHomePage();
		product.openBag();
	}
	
	@Test(priority = 9)
	public void openBagWithoutAddingProductTest() {
		product.visitHomePage();
		product.openBag();
	}
	
	@Test(priority = 10)
	public void AddRemoveCheckCartTest() {
		product.visitHomePage();
		String itemName = "Watch";
		product.searchProduct(itemName);
		product.addTocart();
		product.openBag();
		product.removeProduct();
		product.openBag();
	}
}
