package ob.geocoding;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

/**
 * @author omer.basar.
 */
public class GeocodingRunner {

   public static void main(String[] args) throws Exception {
      new GeocodingRunner().run();
   }

   private void run() throws Exception {

      GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDSNDw0qLRyqwgYALgC9A78CeQI1JtysVc");
      GeocodingResult[] results =  GeocodingApi.geocode(context,
              "Bostancı İstanbul").await();

      System.out.println(results[0].formattedAddress);
   }
}
