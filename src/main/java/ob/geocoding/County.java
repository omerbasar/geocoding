package ob.geocoding;

public class County {

	public County(int countyId, String countyName) {
		super();
		this.countyId = countyId;
		this.cityId = (int) Math.floor(countyId / 1000);
		this.countyName = countyName;
	}
	private int countyId;
	private String countyName;
	private int cityId;
    public int getCountyId() {
		return countyId;
	}
    @Override
	public String toString() {
		return String.valueOf(countyId) + " " + countyName ;
	}

	public void setTownId(int townId) {
		this.countyId = townId;
	}

	public String getTownName() {
		return countyName;
	}

	public void setTownName(String townName) {
		this.countyName = countyName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}