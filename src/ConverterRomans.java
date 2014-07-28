import java.util.HashMap;


public class ConverterRomans {

	private static HashMap<String, Integer> table;
	
	public ConverterRomans() {
		table = new HashMap<String,Integer>();
		table.put("I", 1);
		table.put("II", 2);
		table.put("III", 3);
		table.put("V", 5);
		table.put("X", 10);
		table.put("L", 50);
		table.put("C", 100);
		table.put("D", 500);
		table.put("M", 1000);
	}

	public int convert(String romansNum) {
		int summary=0;
		for (int i = 0; i < table.size(); i++) {
			summary += table.get(romansNum.charAt(i));
		}
		return summary;
	}

}
