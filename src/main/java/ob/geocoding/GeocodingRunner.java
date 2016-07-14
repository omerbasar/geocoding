package ob.geocoding;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;

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

		String address = getAddress("Tünel Girişi Sokak");
		System.out.println("address = " + address);

		String reverseGeoCode = getReverseGeoCode(40.961192, 29.107420);
		System.out.println("reverseGeoCode = " + reverseGeoCode);
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
