package exemplo1.calculadora;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MeuTestRunner {
	public static void main(String[] args) {
		// executa caso de teste e retorna dados sobre testes e falhas
		Result resultado = JUnitCore.runClasses(CalculadoraTeste.class);
		System.out.println("N�mero de falhas: " + resultado.getFailureCount());
			for (Failure failure : resultado.getFailures()) {
				System.out.println("Falha: " + failure.toString() + "\n" + failure.getTrace());
		}
	}
}
