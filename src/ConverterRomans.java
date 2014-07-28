
public class ConverterRomans {

	public int convert(String romansNum) {
		if(romansNum == "I") return 1;
		else if(romansNum == "V") return 5;
		else if(romansNum == "X") return 10;
		
		return 0;
	}

}
