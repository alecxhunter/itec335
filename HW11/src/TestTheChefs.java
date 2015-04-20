import static net.sourceforge.jwebunit.junit.JWebUnit.assertFormNotPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertFormPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertImagePresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTextPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLinkWithExactText;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLinkWithText;
import static net.sourceforge.jwebunit.junit.JWebUnit.closeBrowser;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Alecx Hunter
 * @version 4/9/15
 * ITEC 335
 */

public class TestTheChefs {

	@Before
	public void prepare() {
		setBaseUrl("http://thechefs.tk");
	}
	
	@Test
	public void test() {
		beginAt("/");
		assertTitleEquals("The Chefs | Home");
	}
	
	@Test
	public void test1() {
		beginAt("/about");
		assertTitleEquals("The Chefs | About");
	}
	
	@Test
	public void test2() {
		beginAt("/");
		clickLinkWithExactText("Register");
		assertTitleEquals("The Chefs | Register");
	}
	
	@Test
	public void test3() {
		beginAt("/");
		clickLinkWithText("Log-in");
		assertTitleEquals("The Chefs | Login");
	}

	@Test
	public void test4() {
		beginAt("/");
		assertTextPresent("Welcome To Our Website");
	}
	
	@Test
	public void test5() {
		beginAt("/");
		assertImagePresent("/assets/images/Tibs.jpg", "Roasted Beef with Green Pepper");
	}

	@Test
	public void test6() {
		beginAt("/");
		assertImagePresent("/assets/images/ethiopian.jpg", "Varieties");
	}
	
	@Test
	public void test7() {
		beginAt("/login");
		assertFormPresent();
	}
	
	/**
	 *  /logout should redirect back to the home page
	 */
	@Test
	public void test8() {
		beginAt("/logout");
		assertTitleEquals("The Chefs | Home");
	}
	
	@Test
	public void test9() {
		beginAt("/");
		clickLinkWithText("Articles/videos");
		assertTitleEquals("The Chefs | Articles");
		assertFormNotPresent();
		assertTextPresent("Recently highly rated article");
		
	}
	
	@After
	public void close() {
		closeBrowser();
	}
	
}
