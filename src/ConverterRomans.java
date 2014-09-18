import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @pre 1<2
 * @post hoooo:oooo;dfdfd
 * @author Baraka
 *
 */
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
		for (int i = romansNum.length() - 1; 0 <= i; i--) {
			
			Integer currentNumber = table.get(romansNum.charAt(i)); 
			if (i!=romansNum.length() - 1 && currentNumber < table.get(romansNum.charAt(i+1))){
				summary -= currentNumber;
			} else {
				summary += currentNumber;
			}			
			
		}
		return summary;
	}

	public String convertArabicToRomansNum(int num) {
		String romansNum = "";
		while (num != 0){
			if (num > 0 && num < 10){
				romansNum += this.getKeyByValue(table, num).toString();
			}else {
				romansNum += this.getKeyByValue(table, (num % 10)).toString();
			}
		}
		return romansNum;
			
	}
	
	private <T, E> T getKeyByValue(Map<T, E> map, E value) {
	    for (Entry<T, E> entry : map.entrySet()) {
	        if (value.equals(entry.getValue())) {
	            return entry.getKey();
	        }
	    }
	    return null;
	}

}
