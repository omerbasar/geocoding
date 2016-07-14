package ob.geocoding;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;

public class LocationHelper {

	public static List<City> cities;
    public static List<City> getCities() throws IOException {
		if (cities != null) {
			return cities;
		} else {
			String filePath = "src/main/resources/city.txt";
			String line = null;
			cities = new ArrayList<City>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("\t", 2);
				if (parts.length >= 2) {
					City c = new City(Integer.valueOf(parts[0]), parts[1].trim());
					cities.add(c);
				} 
			}
			reader.close();
			return cities;
		}
	}
	public static List<County> counties;
	public static List<County> getTowns() throws IOException{
		if (counties !=null) {
			return counties;
		}else{
			String filePath="src/main/resources/towns.txt";
			String line=null;
			counties=new ArrayList<County>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("\t", 3);
				if (parts.length >= 2) {
					County t = new County(Integer.valueOf(parts[0]), parts[1].trim());
					counties.add(t);
				} 
			}
			reader.close();
			return counties;
		}
			
	}
	public static List<District> districts;
	public static List<District> getDistricts() throws IOException{
		if (districts !=null) {
			return districts;
		}else{
			String filePath="src/main/resources/districts.txt";
			String line=null;
			districts=new ArrayList<District>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("\t", 3);
				if (parts.length >= 2 ) {
					District d = new District(Integer.valueOf(parts[0].trim()),parts[1].trim(),Integer.valueOf(parts[2].trim()));
					districts.add(d);
				} else {
					System.out.println(line);
				}
			}
			reader.close();
			return districts;
		}
			
	}
	
	
	
	

}
