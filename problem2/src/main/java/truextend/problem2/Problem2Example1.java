package truextend.problem2;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import truextend.problem2.geo.GeoUtil;
import truextend.problem2.geo.LatLon;
import truextend.problem2.model.Classroom;
import truextend.problem2.model.Student;

public class Problem2Example1 
{
	final static Logger log = Logger.getLogger(Problem2Example1.class);
	private static List<Student> studentList = new ArrayList<Student>();
	private static List<Classroom> classroomList = new ArrayList<Classroom>();
	
	static{
		
		studentList.add(new Student("John Wilson", new LatLon(34.069149,-118.442639)));
		studentList.add(new Student("Jane Graham", new LatLon(34.069601,-118.441862)));
		studentList.add(new Student("Pam Bam", new LatLon(34.071513,-118.441181)));
		
		classroomList.add(new Classroom("Principles of computational geo-location analysis", new LatLon(34.069140,-118.442689)));
		classroomList.add(new Classroom("Sedimentary Petrology", new LatLon(34.069585,-118.441878)));
		classroomList.add(new Classroom("Introductory Psychobiology", new LatLon(34.069742,-118.441312)));
		classroomList.add(new Classroom("Art of Listening", new LatLon(34.070223,-118.440193)));
		classroomList.add(new Classroom("Art History", new LatLon(34.071528,-118.441211)));
		
	}
	
	
    public static void main( String[] args )
    {
    	log.info("Students:" + studentList.size());
    	log.info("Classrooms:" + classroomList.size());
    	
    	List<Student> studentInClasses = GeoUtil.studentsInClasses(studentList, classroomList);
    	
     	log.info("Student in Classes, example 1:" + studentInClasses.size() + "\n" + studentInClasses);
    }
    
   
    
    
    
    
    
    
}
