import java.util.HashMap;


public class ConverterRomans {

	private static HashMap<String, Integer> table;
	
	public ConverterRomans() {
		table = new HashMap<String,Integer>();
	}

	public int convert(String romansNum) {
		if(romansNum == "I") return 1;
		else if(romansNum == "V") return 5;
		else if(romansNum == "X") return 10;
			
		return 0;
	}

}
