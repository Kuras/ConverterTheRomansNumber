import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ConverterRomansTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void converteTest() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("I");
		
		assertEquals(1, actual);
	}

}
