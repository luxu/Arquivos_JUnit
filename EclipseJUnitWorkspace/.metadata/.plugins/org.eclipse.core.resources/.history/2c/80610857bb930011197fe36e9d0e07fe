package exemplo6.suite;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteUtils {

	public static junit.framework.Test suite() { 
	    return new JUnit4TestAdapter(TesteUtils.class); 
	} //Necessário para criação de suítes via wizzard - bug do JUnit 4

	@Test
    public void contatenaPalavras() {
        System.out.println("*** concatenaPalavras() ***");
        assertEquals("Hello, world!", Utils.concatenaPalavras("Hello", ", ", "world", "!"));
    }

    @Test(timeout = 1000)
	//Se o teste não terminar em 1 segundo, ele é interrompido e falha
    public void testeComTempo() {
        System.out.println("*** testeComTempo() ***");
        final int fatorialDe = 1 + (int) (20000 * Math.random()); // sorteio entre 1 e 20000
        System.out.println("Computando fatorial de " + fatorialDe);
        System.out.println(fatorialDe + "! = " + Utils.calculaFatorial(fatorialDe));
    }

    @Test(expected = IllegalArgumentException.class)
    public void excecaoExperada() {
        System.out.println("*** excecaoEsperada() ***");
        final int fatorialDe = -5; //número inválido para calculaFatorial()
        System.out.println(fatorialDe + "! = " + Utils.calculaFatorial(fatorialDe));
    }
}