package exemplo6.suite;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteVetores {

	public static junit.framework.Test suite() { 
	    return new JUnit4TestAdapter(TesteVetores.class); 
	} //Necessário para criação de suítes via wizzard - bug do JUnit 4
	
	@Test
    public void vetoresIguais() {
        System.out.println("*** vetoresIguais() ***");
        assertTrue(Vetores.vetoresIguais(new int[]{}, new int[]{}));
        assertTrue(Vetores.vetoresIguais(new int[]{0}, new int[]{0}));
        assertTrue(Vetores.vetoresIguais(new int[]{5, 6, 7}, new int[]{5, 6, 7}));

        assertFalse(Vetores.vetoresIguais(new int[]{}, new int[]{0}));
        assertFalse(Vetores.vetoresIguais(new int[]{0}, new int[]{0, 0}));
        assertFalse(Vetores.vetoresIguais(new int[]{0}, new int[]{}));

        assertFalse(Vetores.vetoresIguais(new int[]{0, 0, 0}, new int[]{0, 0, 1}));
        assertFalse(Vetores.vetoresIguais(new int[]{0, 0, 0}, new int[]{0, 1, 0}));
        assertFalse(Vetores.vetoresIguais(new int[]{0, 0, 0}, new int[]{1, 0, 0}));
    }

    @Test
    public void produtoInternoVetorial() {
        System.out.println("*** produtoInternoVetorial() ***");
        assertEquals(0, Vetores.produtoInternoVetorial(new int[]{0, 0}, new int[]{0, 0}));
        assertEquals(39, Vetores.produtoInternoVetorial(new int[]{3, 4}, new int[]{5, 6}));
        assertEquals(-39, Vetores.produtoInternoVetorial(new int[]{-3, 4}, new int[]{5, -6}));
    }
}
