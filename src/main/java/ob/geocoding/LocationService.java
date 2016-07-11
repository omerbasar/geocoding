package ob.geocoding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocationService {

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
		LocationService p = new LocationService();
		System.out.println("Application started");
		List<City> possibleCities = p.getPossibleCities("Adana yolu caddesi İstanbul");
		possibleCities.stream().forEach(System.out::println);
	}

}
