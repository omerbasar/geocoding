package ob.geocoding;

import java.util.ArrayList;
import java.util.List;

public class LocationService {

   public List<District> getDistricts(String address) {
      List<City> possibleCities = getPossibleCities(address);
      List<District> possibleDistricts = new ArrayList<>();
      for (City possibleCity : possibleCities) {
         List<County> possibleCounties = getPossibleCounties(address, possibleCity.getCityId());
         for (County possibleCounty : possibleCounties) {
            possibleDistricts.addAll(getPossibleDistricts(address, possibleCounty.getCountyId()));
         }
      }
      return possibleDistricts;
   }

   protected List<City> getPossibleCities(String address) {
      List<City> possibleCities = new ArrayList<>();
      List<City> cities = LocationHelper.getCities();
      for (City city : cities) {
         if (address.contains(city.getCityName())) {
            possibleCities.add(city);
         }
      }

      return possibleCities;
   }

   protected List<County> getPossibleCounties(String address, Integer cityId) {
      List<County> possibleCounties = new ArrayList<>();
      List<County> counties = LocationHelper.getTowns(cityId);
      for (County county : counties) {
         if (address.contains(county.getTownName())) {
            possibleCounties.add(county);
         }
      }

      return possibleCounties;
   }

   protected List<District> getPossibleDistricts(String address, Integer townId) {
      List<District> possibleDistricts = new ArrayList<>();
      List<District> districts = LocationHelper.getDistricts(townId);
      for (District district : districts) {
         if (address.contains(district.getDistrictName())) {
            possibleDistricts.add(district);
         }
      }

      return possibleDistricts;
   }
}
