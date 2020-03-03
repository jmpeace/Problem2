package truextend.problem2.model;

import truextend.problem2.geo.LatLon;

public class Student {

	private String name;
	private LatLon latlon;
	
	public Student(String name, LatLon latlon) {
		this.name = name;
		this.latlon = latlon;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", latlon=" + latlon + "]\n";
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
