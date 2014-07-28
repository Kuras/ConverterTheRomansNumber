import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ConverterRomansTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void converteTest_I() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("I");
		
		assertEquals(1, actual);
	}
	
	@Test
	public void converteTest_V() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("V");
		
		assertEquals(5, actual);
	}
	
	@Test
	public void converteTest_X() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("X");
		
		assertEquals(10, actual);
	}
	
	@Test
	public void converteTest_L() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("L");
		
		assertEquals(50, actual);
	}
	
	@Test
	public void converteTest_II() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("II");
		
		assertEquals(2, actual);
	}
	
	@Test
	public void converteTest_III() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("III");
		
		assertEquals(3, actual);
	}
	
	@Test
	public void converteTest_XI() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("XI");
		
		assertEquals(11, actual);
	}
	
	@Test
	public void converteTest_IX() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("IX");
		
		assertEquals(9, actual);
	}
	
	@Test
	public void converteTest_VIII() {
		ConverterRomans converter =  new ConverterRomans();
		int actual = converter.convert("VIII");
		
		assertEquals(8, actual);
	}

}
