package ws.synopsis.surveys.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 * This is the JavaBean
 */
@Entity
public class Registro implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private String curso; 
	private Date fechaInicio;
	private Date fechaFin;
	private Time tiempoInicio;
	private Time tiempoFin;
	private String instuctor;
	private String nombre;
	private String apellido;
	private String empresa;
	private String cargo;
	private String correo;
	private int telefono;
	private String value;
	
	
	public Registro() {
		super();
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public Date getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public Date getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}



	public Time getTiempoInicio() {
		return tiempoInicio;
	}



	public void setTiempoInicio(Time tiempoInicio) {
		this.tiempoInicio = tiempoInicio;
	}



	public String getInstuctor() {
		return instuctor;
	}



	public void setInstuctor(String instuctor) {
		this.instuctor = instuctor;
	}



	public Time getTiempoFin() {
		return tiempoFin;
	}



	public void setTiempoFin(Time tiempoFin) {
		this.tiempoFin = tiempoFin;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
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



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}
   
}
