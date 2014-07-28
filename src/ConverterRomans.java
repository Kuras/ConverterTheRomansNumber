import java.util.HashMap;


public class ConverterRomans {

	private static HashMap<Character,Integer> table;
	
	public ConverterRomans() {
		table = new HashMap<Character,Integer>();
		table.put('I', 1);
		table.put('V', 5);
		table.put('X', 10);
		table.put('L', 50);
		table.put('C', 100);
		table.put('D', 500);
		table.put('M', 1000);
	}

	public int convert(String romansNum) {
		int summary=0;
		for (int i = 0; i < romansNum.length(); i++) {
			summary += table.get(romansNum.charAt(i));
		}
		return summary;
	}

}
