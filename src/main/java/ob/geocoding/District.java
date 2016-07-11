package ob.geocoding;

public class District {

	private int districtId;
	private int townId;
	private String districtName;
	


	public District(int districtId, int townId, String districtName) {
		super();
		this.districtId = districtId;
		this.townId = townId;
		this.districtName = districtName;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getTownId() {
		return townId;
	}

	public void setTownId(int townId) {
		this.townId = townId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	
}
