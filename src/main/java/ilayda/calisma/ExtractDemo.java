package ilayda.calisma;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

import ob.geocoding.GeocodingRunner;

public class ExtractDemo {

	public static void main(String[] args) throws Exception {
		GeocodingRunner runner = new GeocodingRunner();
		String input = runner.getAddress("Bostancı, Tünel Girişi Sk., 34744 Kadıköy/İstanbul, Turkey");
		Pattern p = Pattern.compile("(Kadıköy)");
		Matcher m = p.matcher(input);

		List<String> address = new ArrayList<String>();
		while (m.find()) {
			System.out.println("Found a " + m.group() + ".");
			address.add(m.group());
		}


		
		
		
		
	}
	
	
}



