package ob.geocoding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PossibleCity {

	// getPossibleCity ?

	public List<City> getPossibleCities(String cityName) throws IOException {
		List<City> possibleCities = new ArrayList<>();
		List<City> cities = LocationHelper.getCities();
		for (int i = 0; i < cities.size(); i++) {
			City city = cities.get(i);
			if (cityName.contains(city.getCityName())) {
				possibleCities.add(city);
			}
		}
		
		return possibleCities;
	}

	public static void main(String[] args) throws IOException {
		PossibleCity p = new PossibleCity();
		System.out.println("Application started");
		List<City> possibleCities = p.getPossibleCities("Adana yolu caddesi �stanbul");
		possibleCities.stream().forEach(System.out::println);
	}

}
