package truextend.problem2.model;

import truextend.problem2.geo.LatLon;

public class Classroom {

	private String name;
	private LatLon latlon;//center of a 20mx20m room
	
	public Classroom(String name, LatLon latlon) {
		this.name = name;
		this.latlon = latlon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LatLon getLatlon() {
		return latlon;
	}
	public void setLatlon(LatLon latlon) {
		this.latlon = latlon;
	}
	
	
}
