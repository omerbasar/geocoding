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
			String filePath = "C:\\city.txt";
			String line = null;
			cities = new ArrayList<City>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("\t", 2);
				if (parts.length >= 2) {
					City c = new City(Integer.valueOf(parts[0]), parts[1]);
					cities.add(c);
				} 
			}
			reader.close();
			return cities;
		}
	}
	public static List<Town> towns;
	
	public static List<Town> getTowns() throws IOException{
		if (towns !=null) {
			return towns;
		}else{
			String filePath="C:\\towns.txt";
			String line=null;
			towns=new ArrayList<Town>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("/t", 2);
				if (parts.length >= 2 /*&& ? */) {
					Town t = new Town(Integer.valueOf(parts[0]), parts[1]);
					towns.add(t);
				} else {
					System.out.println(line);
				}
			}
			reader.close();
			return towns;
		}
			
	}
	public static List<District> districts;
	public static List<District> getDistrict() throws IOException{
		if (towns !=null) {
			return districts;
		}else{
			String filePath="C:\\district.txt";
			String line=null;
			towns=new ArrayList<Town>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("/t", 3);
				if (parts.length >= 2 /*&& ? */) {
					District d = new District(Integer.valueOf(parts[0]),Integer.valueOf(parts[1]),parts[2]);
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
