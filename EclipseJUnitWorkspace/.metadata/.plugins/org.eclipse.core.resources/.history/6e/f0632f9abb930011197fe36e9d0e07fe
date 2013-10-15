// http://www.guj.com.br/articles/40

package exemplo7.temperatura;

import junit.framework.TestCase;

public class TemperatureTransformerTest extends TestCase{
	public void testConvert() throws Exception{
		Temperature t = new FahrenheitTemperature();
		t.setValue(32);
		TemperatureTransformer tc = new TemperatureTransformer();
		Temperature f = tc.convert(t);
		assertTrue(f.getValue() == 0);
	}	
}