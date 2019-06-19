package ws.synopsis.surveys.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 * This is the JavaBean
 */
@Entity
@Table(name = "estudiantes")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String userType; //estudiante, instructor, o administrador
	private String nombre;
	private String apellido;
	private String userName;
	private String correo;
	private String telefono;
	private String compania;
	private String cargo;
	
	public User() {
		super();
	}
	
	public User(String nombre, String apellido, String userName, String correo, String telefono, String compania, String cargo) {
		
		this.apellido = apellido;
		this.nombre = nombre;
		this.userName = userName;
		this.correo = correo;
		this.telefono = telefono;
		this.compania = compania;
		this.cargo = cargo;
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
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}