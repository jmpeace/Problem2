package truextend.problem2.model;

import truextend.problem2.geo.GeoUtil;
import truextend.problem2.geo.LatLon;

public class Classroom {

	private String name;
	private LatLon latlon;//center of a 20mx20m room
	
	//util
	private LatLon sw;//south west
	private LatLon se;//south east
	private LatLon nw;//north west
	private LatLon ne;//north east
	
	
	@Override
	public String toString() {
		return "Classroom [name=" + name + ", latlon=" + latlon + "]";
	}
	public Classroom(String name, LatLon latlon) {
		this.name = name;
		this.latlon = latlon;
		this.sw =  GeoUtil.move(latlon,-10,-10);
		this.se =  GeoUtil.move(latlon,10,-10);
		this.nw =  GeoUtil.move(latlon,-10,10);
		this.ne =  GeoUtil.move(latlon,10,10);
		
//		System.out.println("SW " + sw + " SE " + se + "NW "+  nw + "NE " + ne);
	
	}
	
	public boolean isInside(LatLon latlon)
	{
		return GeoUtil.isInside(latlon,sw,se,nw,ne);
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
