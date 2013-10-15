package exemplo3.janela;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JanelaTest {
	private Janela jan;
	
	@Before
	public void setUp() throws Exception {
		jan = new Janela(30, 20);
	}

	@After
	public void tearDown() throws Exception {
		jan = null;
	}

	@Test
	public void testExibir() {
		jan.exibir();
//		jan.setLocation(10, 10);
		assertEquals(jan.getLocation().x, 30);
		assertEquals(jan.getLocation().y, 20);
		assertEquals(jan.getTitle(), "30,20");
	}
}
