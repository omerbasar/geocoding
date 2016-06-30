package ob.geocoding;

public class Town {

	public Town(int townId, String townName) {
		super();
		this.townId = townId;
		this.townName = townName;
	}
	private int townId;
	private String townName;
	private int cityId;
    public int getTownId() {
		return townId;
	}

	public void setTownId(int townId) {
		this.townId = townId;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}