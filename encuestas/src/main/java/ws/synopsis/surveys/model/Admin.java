package ws.synopsis.surveys.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ADMININSTRATORS")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dni")
	private String DNI;
	private String userType;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private String username;
	private String contrasena;
	
	
	public Admin() {
		super();
	}
	
	public Admin(String DNI, String userType, String nombre, String apellido, String correo, String telefono, String username, String contrasena) {
		this.DNI = DNI;
		this.setUserType(userType);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setCorreo(correo);
		this.setTelefono(telefono);
		this.setUsername(username);
		this.setContrasena(contrasena);
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

	public void setUserType(String userType) {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
