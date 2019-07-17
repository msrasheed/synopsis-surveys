package ws.synopsis.surveys.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey This is the JavaBean
 */
@Entity
@Table(name = "attendance")
public class Attendance implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Nombre")
	
	private String Nombre;
	private String apellido; 
	private String coursecode;
	private String coursename;
	private String aula;
	private String Instructor;
	private String startdate;
	private String endate;
	private String hora;

	public Attendance() {
		super();
	}

	public Attendance(String Nombre, String apellido, String coursecode, String coursename, String aula,
			String Instructor, String endate, String hora, String startdate) {

		this.Nombre = Nombre;
		this.coursecode = coursecode;
		this.apellido = apellido;
		this.aula = aula;
		this.coursename = coursename;
		this.Instructor = Instructor;
		this.endate = endate;
		this.startdate = startdate;
		this.hora = hora;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}


	public String getEndate() {
		return endate;
	}

	public void setEndate(String endate) {
		this.endate = endate;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getInstructor() {
		return Instructor;
	}

	public void setInstructor(String instructor) {
		Instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}