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

	public List<County> getPossibleCounties(String countyName) throws IOException {
		List<County> possibleCounties = new ArrayList<>();
		List<County> counties = LocationHelper.getTowns();
		for (int i = 0; i < counties.size(); i++) {
			County county = counties.get(i);
			if (countyName.contains(county.getTownName())) {
				possibleCounties.add(county);
			}
		}

		return possibleCounties;
	}

	public List<District> getPossibleDistricts(String districtName) throws IOException {
		List<District> possibleDistricts = new ArrayList<>();
		List<District> districts = LocationHelper.getDistricts();
		for (int i = 0; i < districts.size(); i++) {
			District district = districts.get(i);
			if (districtName.contains(district.getDistrictName())) {
				possibleDistricts.add(district);
			}
		}

		return possibleDistricts;
	}

	public static void main(String[] args) throws IOException {
		LocationService p = new LocationService();
		System.out.println("Application started");
		List<City> possibleCities = p.getPossibleCities("Adana yolu caddesi İstanbul");
		possibleCities.stream().forEach(System.out::println);

		System.out.println("deneme2");
		List<County> possibleCounties = p.getPossibleCounties("Beşiktaş");
		possibleCounties.stream().forEach(System.out::println);

		System.out.println("deneme3");
		List<District> possibleDistricts = p.getPossibleDistricts("Cihannüma");
		possibleDistricts.stream().forEach(System.out::println);

	}

}
