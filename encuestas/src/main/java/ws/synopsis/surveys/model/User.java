package ws.synopsis.surveys.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 * This is the JavaBean
 */
@Entity
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private String userType; //estudiante, instructor, o administrador
	private String nombre;
	private String apellido;
	private String userName;
	
	
	
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
	
	
	
	
}