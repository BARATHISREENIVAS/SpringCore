package in.school.SpringDataJpa.manytomany;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.school.SpringDataJpa.manytomany.entity.Course;
import in.school.SpringDataJpa.manytomany.entity.Student;
import in.school.SpringDataJpa.manytomany.repository.CourseRepository;
import in.school.SpringDataJpa.manytomany.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaManyToManyRelationshipsApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private CourseRepository courseRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaManyToManyRelationshipsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student sreenu = new Student();
		sreenu.setStudentId(1);
		sreenu.setStudentName("Sreenu");
		sreenu.setStudentEmail("sreenu200@gmail.com");
		
		Student sanath = new Student();
		sanath.setStudentId(2);
		sanath.setStudentName("Sanath");
		sanath.setStudentEmail("Sanath@gmail.com");
		
		Student raki = new Student();
		raki.setStudentId(3);
		raki.setStudentName("Rakesh");
		raki.setStudentEmail("rakesh@gmail.com");
		
		Student sai = new Student();
		sai.setStudentId(4);
		sai.setStudentName("Sai Kumar");
		sai.setStudentEmail("Sai@gmail.com");
		
//		Student niteesh = new Student();
//		niteesh.setStudentId(5);
//		niteesh.setStudentName("Niteesh");
//		niteesh.setStudentEmail("niteesh@gmail.com");
		
		Course telugu= new Course();
		telugu.setCourseId(1);
		telugu.setCourseTitle("Telugu");
		telugu.setCoursedescription("To learn Telugu");
		
		Course english = new Course();
		english.setCourseId(2);
		english.setCourseTitle("English");
		english.setCoursedescription("To Speak English");
		
		Course java = new Course();
		java.setCourseId(3);
		java.setCourseTitle("Java");
		java.setCoursedescription("To learn Core Java");
		
		Course spring = new Course();
		spring.setCourseId(4);
		spring.setCourseTitle("SPring Data JPA");
		spring.setCoursedescription("To build applications");
		
		Course testing = new Course();
		testing.setCourseId(5);
		testing.setCourseTitle("Manual Testing");
		testing.setCoursedescription("To test software applications");
		
		Course postman = new Course();
		postman.setCourseId(6);
		postman.setCourseTitle("PostMan Tool");
		postman.setCoursedescription("To test api's");
		
		sreenu.setCourse(Arrays.asList(java,postman,spring));
		sanath.setCourse(Arrays.asList(telugu,english));
		raki.setCourse(Arrays.asList(testing,english,java));
		sai.setCourse(Arrays.asList(english,postman));
		
		courseRepo.saveAll(Arrays.asList(english,java,spring,testing,postman,telugu));
		studentRepo.saveAll(Arrays.asList(sreenu,sai,sanath,raki));
	}

}
