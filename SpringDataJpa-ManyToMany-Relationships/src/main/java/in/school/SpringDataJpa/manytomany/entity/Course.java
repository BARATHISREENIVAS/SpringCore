package in.school.SpringDataJpa.manytomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Course")
	public class Course {

		@Column(name="Course_Id")
		private int courseId;
		@Id
		@Column(name="Course_Title")
		private String courseTitle;
		@Column(name="Course_Description")
		private String coursedescription;
		
		@ManyToMany(mappedBy = "course")
		private List<Student> student;

		public Course(int courseId, String courseTitle, String coursedescription, List<Student> student) {
			super();
			this.courseId = courseId;
			this.courseTitle = courseTitle;
			this.coursedescription = coursedescription;
			this.student = student;
		}

		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseTitle() {
			return courseTitle;
		}

		public void setCourseTitle(String courseTitle) {
			this.courseTitle = courseTitle;
		}

		public String getCoursedescription() {
			return coursedescription;
		}

		public void setCoursedescription(String coursedescription) {
			this.coursedescription = coursedescription;
		}

		public List<Student> getStudent() {
			return student;
		}

		public void setStudent(List<Student> student) {
			this.student = student;
		}
}
