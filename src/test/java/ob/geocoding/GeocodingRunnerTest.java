package ob.geocoding;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;



public class GeocodingRunnerTest {

   GeocodingRunner geocodingRunner = new GeocodingRunner();

   @Test
   public void testGetAddressOfUser0() throws Exception {
      String address = geocodingRunner.getAddress("T�nel Giri�i Sokak");
      assertThat(address, is("Bostanc�, T�nel Giri�i Sk., 34744 Kad�k�y/�stanbul, Turkey"));
   }

   @Test
   public void testGetAddressOfUser1() throws Exception {
      String address = geocodingRunner.getAddress("T�nel Giri�i Sokak Tek-Per sitesi F Blok D:10 Bostanc� �stanbul");
      assertThat(address, is("Bostanc�, T�nel Giri�i Sk., 34744 Kad�k�y/�stanbul, Turkey"));
   }
   
   
}
