package exemplo4.excecoes;
import org.junit.*;
 
public class TesteExcecao {
 
	@Test  
	public void divisaoComExcecao() {  
	  int i = 4 / 0; //teste resulta em erro por causa da exceção
	  System.out.println("divisaoComExcecao(): " + i);
	}  

	@Test(expected = ArithmeticException.class)  
	public void divisaoEsperandoExcecao1() {  
	  int i = 4 / 0; //teste passa, pois espera a exceção
	  System.out.println("divisaoEsperandoExcecao'(): " + i);
	}  

	@Test(expected = ArithmeticException.class)  
	public void divisaoEsperandoExcecao2() {  
	  int i = 4 / 4; //teste falha, pois não ocorre a exceção esperada
	  System.out.println("divisaoEsperandoExcecao2(): " + i);
	}  

	@Test  
	public void divisaoSemExcecao() {  
	  int i = 4 / 2;
	  System.out.println("divisaoSemExcecao(): " + i);
	}  
}
