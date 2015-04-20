import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author Alecx Hunter
 * @version 4/20/15
 * ITEC 335 | HW 13
 *
 */
public class TestItec {

	@Before
	public void prepare() {
		setBaseUrl("http://www.radford.edu/content/csat/home/itec/programs/");
		beginAt("computer-science.html");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
