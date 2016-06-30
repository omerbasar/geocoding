package ob.geocoding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LocationHelper {



	public static List<City> cities;

	public static List<City> getCities() throws IOException {
		if (cities != null) {
			return cities;
		} else {
			String filePath = "C:\\city.txt";
			String line = null;
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("/t", 2);
				if (parts.length >= 2) {
					City c = new City(Integer.valueOf(parts[0]), parts[1]);
					cities.add(c);
				} else {
					System.out.println(line);
				}
			}

			reader.close();
			return cities;
		}
	}


	
}
