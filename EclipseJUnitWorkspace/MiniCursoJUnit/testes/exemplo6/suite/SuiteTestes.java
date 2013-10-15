package exemplo6.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { TesteUtils.class, TesteVetores.class })
public class SuiteTestes {
}
