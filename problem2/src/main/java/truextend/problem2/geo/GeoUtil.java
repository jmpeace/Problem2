package truextend.problem2.geo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import truextend.problem2.model.Classroom;
import truextend.problem2.model.Student;

/**
 * 
 * @author jmpaz
 *
 */
public class GeoUtil {
	
	 private static double EARTHRADIUOS = 6378137.0;
	
	 public static List<Student> studentsInClasses(List<Student> studentList,List<Classroom> classroomList)
	 {
		 Set<Student> result = new HashSet<Student>();
		 
		 for(Classroom classroom:classroomList)
			 for(Student student:studentList)
				 if(classroom.isInside(student.getLatlon()))
					 result.add(student);
		 
		 return new ArrayList<Student>(result);
		 
	 }

	public static LatLon move(LatLon latlon, int east, int north) {

		double newLat = latlon.getLat()+(east/EARTHRADIUOS)*(180/Math.PI);
		double newLon = latlon.getLon()+(north/EARTHRADIUOS)*(180/Math.PI)/Math.cos(latlon.getLat()*Math.PI/180);
		
		return new LatLon(newLat,newLon);
	}

	public static boolean isInside(LatLon latlon, LatLon sw, LatLon se, LatLon nw, LatLon ne) {

		double lat = latlon.getLat();
		double lon = latlon.getLon();
		
		double latw = sw.getLat();//WEST
		double late = ne.getLat();//EAST
		double lonn = nw.getLon();//NORTH
		double lons = se.getLon();//SOUTH
		
		boolean insideLat = lat>=latw&&lat<=late;
		boolean insideLon = lon>=lons&&lon<=lonn;
		
		return insideLat&&insideLon;
	}

}
