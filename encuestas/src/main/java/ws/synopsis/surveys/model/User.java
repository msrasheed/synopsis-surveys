package ws.synopsis.surveys.model;

import java.io.Serializable;

import javax.persistence.*;
import java.sql.*;

/**
 * Entity implementation class for Entity: Survey
 * This is the JavaBean
 */
@Entity
@Table(name = "estudiantes")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dni")
	private String DNI;
	private String userType; //estudiante, instructor, o administrador
	private String nombre;
	private String apellido;
	private String userName;
	private String contrasena;
	private String correo;
	private String telefono;
	private String empresa;
	private String cargo;
	
	public User() {
		super();
	}
	
	public User(String DNI, String userType, String nombre, String apellido, String userName, String contrasena, String correo, String telefono, String empresa, String cargo) {
		
		this.DNI = DNI;
		this.userType = userType;
		this.apellido = apellido;
		this.nombre = nombre;
		this.userName = userName;
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
	public String getEmpresa() {
		return empresa;
	}
	public void setCompania(String empresa) {
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
	
	
	
	
}