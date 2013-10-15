package exemplo2.sequenciametodos;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
 
@SuppressWarnings({"rawtypes", "unchecked"})
public class TesteJUnit {

	private Collection colecao;

	@BeforeClass
    public static void inicializacaoGeral() {   
    	System.out.println("@BeforeClass: inicializacaoGeral()");
    }

    @AfterClass
    public static void finalizacaoGeral() {
    	System.out.println("@AfterClass: finalizacaoGeral()");
    }

	@Before
    public void antes() {
        colecao = new ArrayList();
        System.out.println("@Before: antes()");
    }

    @After
    public void apos() {
        colecao.clear();
        System.out.println("@After: apos()");
    }

    @Test
    public void colecaoVaiza() {
        assertTrue(colecao.isEmpty());
        System.out.println("@Test: colecaoVazia()");
    }

//	@Ignore("Não está pronto...")
    @Test
    public void colecao1Item() {
        colecao.add("Primeiro");
        assertEquals(1, colecao.size());
        System.out.println("@Test colecao1Item");
    }
}
