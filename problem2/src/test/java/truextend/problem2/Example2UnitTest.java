package truextend.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import truextend.problem2.geo.GeoUtil;
import truextend.problem2.geo.LatLon;
import truextend.problem2.model.Classroom;
import truextend.problem2.model.Student;

public class Example2UnitTest {
	
	private static List<Student> studentList = new ArrayList<Student>();
	private static List<Classroom> classroomList = new ArrayList<Classroom>();
	private static Student pamBam;
	
	
	@Before
	public void setUp() throws Exception {
		studentList.add(new Student("John Wilson", new LatLon(34.069849,-118.443539)));
		studentList.add(new Student("Jane Graham", new LatLon(34.069901,-118.441562)));
		
		pamBam = new Student("Pam Bam", new LatLon(34.071523,-118.441171));
		studentList.add(pamBam);
		
		classroomList.add(new Classroom("Principles of computational geo-location analysis", new LatLon(34.069140,-118.442689)));
		classroomList.add(new Classroom("Sedimentary Petrology", new LatLon(34.069585,-118.441878)));
		classroomList.add(new Classroom("Introductory Psychobiology", new LatLon(34.069742,-118.441312)));
		classroomList.add(new Classroom("Art of Listening", new LatLon(34.070223,-118.440193)));
		classroomList.add(new Classroom("Art History", new LatLon(34.071528,-118.441211)));
	}

	@Test
	public void test() {
		
		List<Student> studentInClasses = GeoUtil.studentsInClasses(studentList, classroomList);
		System.out.println(studentInClasses);
		assertTrue(studentInClasses.contains(pamBam));
		
	}

}
