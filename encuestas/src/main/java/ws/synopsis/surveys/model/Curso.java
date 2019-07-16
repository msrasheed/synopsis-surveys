package ws.synopsis.surveys.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 * This is the JavaBean for the table "cursos" on the database
 */
@Entity
@Table(name = "CURSOS")
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String courseId;
	private String courseName;
	private String instructor;
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	
	
	public Curso() {
		super();
	}
	
	public Curso(String courseId, String courseName, String instructor, String startDate, String endDate, String startTime, String endTime) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
	
	
	