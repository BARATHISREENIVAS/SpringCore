package in.school.SpringDataJpa.manytomany.entity;

import java.util.List;

import in.school.SpringDataJpa.manytomany.entity.Course;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

	@Column(name ="Student_ID")
	private int studentId;
	@Id
	@Column(name ="Student_Name")
	private String studentName;
	@Column(name ="Student_Email")
	private String studentEmail;

	@ManyToMany
	@JoinTable(name = "Student_Course",joinColumns = @JoinColumn(name="studentName"),
	inverseJoinColumns = @JoinColumn(name="courseTitle"))	
	private List<Course> course;

	
	
	public Student(int studentId, String studentName, String studentEmail, List<Course> course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this. course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public List<Course> getCourse() {
		return  course;
	}

	public void setCourse(List<Course> course) {
		this. course = course;
	}
	
	
}
