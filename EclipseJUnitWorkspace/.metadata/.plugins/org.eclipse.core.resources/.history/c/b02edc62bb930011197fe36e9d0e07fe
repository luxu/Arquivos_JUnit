package exemplo6.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MeuTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SuiteTestes.class);
		for (Failure failure : result.getFailures()) {
			System.out.println("Falha: " + failure.toString());
		}
	}
}
