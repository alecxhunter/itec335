import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Alecx Hunter
 * @version 4/18/15
 * ITEC 335
 * Tests the ITEC 225 backpacks.html assignment
 */
public class TestBackpacks {

	@Before
	public void prepare() {
		setBaseUrl("http://www.radford.edu/~dbraffitt/itec335/2015/spring/class");
		beginAt("backpacks4.html");
	}
	
	@Test
	public void testTitle() {
		assertTitleEquals("Backpacks, Limited");
	}
	
	@Test
	public void testImages() {
		assertElementPresent("image1");
		assertElementPresent("image2");
		assertElementPresent("image3");
	}
	
	@Test
	public void testDescriptions() {
		assertElementPresent("description1");
		assertElementPresent("description2");
		assertElementPresent("description3");
	}
	
	@Test
	public void testLists() {
		assertElementPresent("unorderedList1");
		assertElementPresent("orderedList1");
	}
	
	@Test
	public void testTable() {
		assertElementPresent("table1");
	}
	
	@Test
	public void testNested() {
		assertElementPresentByXPath("//ul[@id='unorderedList1']//ol[@id='orderedList1']");
	}
	
	@Test
	public void testImageLink() {
		assertElementPresentByXPath("//a[@id='link1']/img[@id='image1']");
	}
	
	@Test
	public void testLink() {
		assertLinkPresent("link4");
	}
	
	@Test
	public void testLinkInTable() {
		assertElementPresentByXPath("//table[@id='table1']//a[@id='link3']");
	}
	
	@Test
	public void testCopyright() {
		assertElementPresent("copyright1");
	}
}
