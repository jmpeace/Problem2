package truextend.problem2.geo;

import java.math.BigDecimal;

public class LatLon {
	
	private BigDecimal lat;
	private BigDecimal lon;
	
	public LatLon(BigDecimal lat, BigDecimal lon) {
		this.lat = lat;
		this.lon = lon;
	}
	public LatLon(String lat, String lon) {
		this(new BigDecimal(lat),new BigDecimal(lon));
	}
	public BigDecimal getLat() {
		return lat;
	}
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}
	public BigDecimal getLon() {
		return lon;
	}
	public void setLon(BigDecimal lon) {
		this.lon = lon;
	}
	
	

}
