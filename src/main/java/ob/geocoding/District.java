package ob.geocoding;

public class District {

	private int districtId;
	private int countyId;
	private String districtName;

	public String toString() {
		return String.valueOf(districtId) + " " + districtName + " " +String.valueOf(countyId);
	}

	public District(int districtId,String districtName, int countyId) {
		super();
		this.districtId = districtId;
		this.countyId = countyId;
		this.districtName = districtName;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getCountyId() {
		return countyId;
	}

	public void setCountyId(int townId) {
		this.countyId = townId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

}
