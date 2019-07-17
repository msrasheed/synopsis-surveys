package ws.synopsis.surveys.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 * This is the JavaBean
 */
@Entity
@Table(name = "ESTUDIANTES")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dni")
	private String DNI;
	private String userType; //estudiante, instructor, o administrador
	private String nombre;
	private String apellido;
	private String username;
	private String contrasena;
	private String correo;
	private String telefono;
	private String empresa;
	private String cargo;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String DNI, String userType, String nombre, String apellido, String username, String contrasena, String correo, String telefono, String empresa, String cargo) {
		
		this.DNI = DNI;
		this.userType = userType;
		this.apellido = apellido;
		this.nombre = nombre;
		this.username = username;
		this.contrasena = contrasena;
		this.correo = correo;
		this.telefono = telefono;
		this.empresa = empresa;
		this.cargo = cargo;
	}	
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public String getUserType() {
		return userType;
	}
	public void setuserType(String userType) {
		this.userType = userType;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}