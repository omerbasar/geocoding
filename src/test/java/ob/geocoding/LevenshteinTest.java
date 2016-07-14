package ob.geocoding;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ilayda.calisma.LevenshteinExample;

public class LevenshteinTest {

	LevenshteinExample object = new LevenshteinExample();

	   @Test
	   public void testLevenshteinDistance() throws Exception {
	      int deneme = object.LevenstheinDistance("", "");
	      assertThat(deneme,is(6));
	   }
}
