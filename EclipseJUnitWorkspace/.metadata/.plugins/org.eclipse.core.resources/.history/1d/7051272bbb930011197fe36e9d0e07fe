package exemplo5.memoria;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMemoriaTest {
	CD cd;
	HD hd;
	
	@Before
	public void setUp() throws Exception {
		cd = new CD(10000, 2);
		hd = new HD("01", 1000, 2);
	}

	@Test
	public void testGravaKB(){
		assertEquals(cd.GravaKB(10000), true);
		assertEquals(cd.GravaKB(10001), false);

		assertEquals(hd.GravaKB(1000), true);
		assertEquals(hd.GravaKB(1001), false);
	}

	@After
	public void tearDown() throws Exception {
		cd = null;
		hd = null;
    }
}