import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ConverterRomansTest_FromArabicToRoman {

	private ConverterRomans converterRomans;
	
	@Before
	public void setUp() throws Exception {
		converterRomans = new ConverterRomans();
	}
	
	@After
	public void after() throws Exception {
		converterRomans = null;
	}

	@Test
	public void testConvert_1toI() {
		String actual = converterRomans.convertArabicToRomansNum(1);
		assertEquals("I", actual);
	}
	
	@Test
	public void testConvert_5toV() {
		String actual = converterRomans.convertArabicToRomansNum(5);
		assertEquals("V", actual);
	}
	
	@Test
	public void testConvert_10toX() {
		String actual = converterRomans.convertArabicToRomansNum(10);
		assertEquals("X", actual);
	}

	@Test
	public void testConvert_50toL() {
		String actual = converterRomans.convertArabicToRomansNum(50);
		assertEquals("L", actual);
	}
	
	@Test
	public void testConvert_2toII() {
		String actual = converterRomans.convertArabicToRomansNum(2);
		assertEquals("II", actual);
		
		
	}
}
