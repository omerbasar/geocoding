package ob.geocoding;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author obasar
 */
public class GeocodingRunnerTest {

   GeocodingRunner geocodingRunner = new GeocodingRunner();

   @Test
   public void testGetAddressOfUser0() throws Exception {
      String address = geocodingRunner.getAddress("Tünel Girişi");
      assertThat(address, is("Bostancı, Tünel Girişi Sk., 34744 Kadıköy/İstanbul, Turkey"));
   }

   @Test
   public void testGetAddressOfUser1() throws Exception {
      String address = geocodingRunner.getAddress("Tünel Yolu Caddesi Tek-Per sitesi F Blok D:10 Bostancı İstanbul");
      assertThat(address, is("Bostancı, Tünel Girişi Sk., 34744 Kadıköy/İstanbul, Turkey"));
   }
}
