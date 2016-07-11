package ob.geocoding;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;



public class GeocodingRunnerTest {

   GeocodingRunner geocodingRunner = new GeocodingRunner();

   @Test
   public void testGetAddressOfUser0() throws Exception {
      String address = geocodingRunner.getAddress("Tünel Giriþi Sokak");
      assertThat(address, is("Bostancý, Tünel Giriþi Sk., 34744 Kadýköy/Ýstanbul, Turkey"));
   }

   @Test
   public void testGetAddressOfUser1() throws Exception {
      String address = geocodingRunner.getAddress("Tünel Giriþi Sokak Tek-Per sitesi F Blok D:10 Bostancý Ýstanbul");
      assertThat(address, is("Bostancý, Tünel Giriþi Sk., 34744 Kadýköy/Ýstanbul, Turkey"));
   }
   
   
}
