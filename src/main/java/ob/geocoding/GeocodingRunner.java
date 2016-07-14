package ob.geocoding;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GeocodingRunner {

	private static GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDSNDw0qLRyqwgYALgC9A78CeQI1JtysVc");

	static {
		context.setQueryRateLimit(3).setConnectTimeout(1, TimeUnit.SECONDS).setReadTimeout(1, TimeUnit.SECONDS)
				.setWriteTimeout(1, TimeUnit.SECONDS);
	}

	public static void main(String[] args) throws Exception {
		new GeocodingRunner().run();
	}

	private void run() throws Exception {

		//String address = getAddress("Tünel Girişi Sokak");
		//System.out.println("address = " + address);

		//String reverseGeoCode = getReverseGeoCode(40.961192, 29.107420);
		//System.out.println("reverseGeoCode = " + reverseGeoCode);

		List<District> districts = new LocationService().getDistricts("Tunel Yolu Caddesi Bostancı Kadıköy İstanbul");
		for (District district : districts) {
			System.out.println("district = " + district);
		}

		/*
		LocationService p = new LocationService();
		System.out.println("Application started");
		List<City> possibleCities = p.getPossibleCities("Adana yolu caddesi İstanbul");
		possibleCities.stream().forEach(System.out::println);

		System.out.println("deneme2");
		List<County> possibleCounties = p.getPossibleCounties("Beşiktaş", 34);
		possibleCounties.stream().forEach(System.out::println);

		System.out.println("deneme3");
		List<District> possibleDistricts = p.getPossibleDistricts("Cihannüma", 34001);
		possibleDistricts.stream().forEach(System.out::println);
		*/
	}

	public String getAddress(String address) throws Exception {

		GeocodingResult[] results = GeocodingApi.geocode(context, address).await();

		if (results.length > 0) {
			return results[0].formattedAddress;
		} else {
			return null;
		}
	}

	public String getReverseGeoCode(Double latitude, Double longitude) throws Exception {
		GeocodingResult[] results = GeocodingApi.newRequest(context).latlng(new LatLng(latitude, longitude)).await();

		if (results.length > 0) {
			return results[0].formattedAddress;
		} else {
			return null;
		}
	}



	
		
		
	
}
