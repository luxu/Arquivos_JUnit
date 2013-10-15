import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ContaTest {
	
	private Conta contaCorrente;

	@Before
	public void setUp() throws Exception {
		System.out.println("Inicio da Conta/Corrente");
		contaCorrente = new Conta(1300.50);
	}

	@After
	public void tearDown() throws Exception {
		contaCorrente = null;
		System.out.println("Fim da Conta/Corrente");
	}

	@Test
	public void testGetSaldo() {
		assertEquals(1300.50, contaCorrente.getSaldo(),0.5);
		System.out.println("Valor da Conta no momento: " + contaCorrente.getSaldo());
	}

	@Test
	public void testDeposito() {
		contaCorrente.deposito(100);
		assertEquals(1400.50, contaCorrente.getSaldo(),0.5);
		System.out.println("Após o depósito de 100 reais passou: " + contaCorrente.getSaldo());
	}

}
