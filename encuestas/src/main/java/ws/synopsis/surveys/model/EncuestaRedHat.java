package ws.synopsis.surveys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EncuestaRedHat
 *
 */
@Entity

public class EncuestaRedHat implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int respuesta1;
	private int respuesta2;
	private int respuesta3;
	private int respuesta4;
	private int respuesta5;
	private int respuesta6;
	private int respuesta7;
	private int respuesta8;
	private int respuesta9;
	private int respuesta10;
	private int respuesta11;
	private int respuesta12;
	private String respuesta12text;
	private int respuesta13;
	private int respuesta14;
	private int respuesta15;
	private String respuesta16;
	
	
	
	
	public EncuestaRedHat() {
		super();
	}




	public int getRespuesta1() {
		return respuesta1;
	}




	public void setRespuesta1(int respuesta1) {
		this.respuesta1 = respuesta1;
	}




	public int getRespuesta2() {
		return respuesta2;
	}




	public void setRespuesta2(int respuesta2) {
		this.respuesta2 = respuesta2;
	}




	public int getRespuesta3() {
		return respuesta3;
	}




	public void setRespuesta3(int respuesta3) {
		this.respuesta3 = respuesta3;
	}




	public int getRespuesta5() {
		return respuesta5;
	}




	public void setRespuesta5(int respuesta5) {
		this.respuesta5 = respuesta5;
	}




	public int getRespuesta4() {
		return respuesta4;
	}




	public void setRespuesta4(int respuesta4) {
		this.respuesta4 = respuesta4;
	}




	public int getRespuesta6() {
		return respuesta6;
	}




	public void setRespuesta6(int respuesta6) {
		this.respuesta6 = respuesta6;
	}




	public int getRespuesta7() {
		return respuesta7;
	}




	public void setRespuesta7(int respuesta7) {
		this.respuesta7 = respuesta7;
	}




	public int getRespuesta8() {
		return respuesta8;
	}




	public void setRespuesta8(int respuesta8) {
		this.respuesta8 = respuesta8;
	}




	public int getRespuesta9() {
		return respuesta9;
	}




	public void setRespuesta9(int respuesta9) {
		this.respuesta9 = respuesta9;
	}




	public int getRespuesta10() {
		return respuesta10;
	}




	public void setRespuesta10(int respuesta10) {
		this.respuesta10 = respuesta10;
	}




	public int getRespuesta11() {
		return respuesta11;
	}




	public void setRespuesta11(int respuesta11) {
		this.respuesta11 = respuesta11;
	}




	public int getRespuesta12() {
		return respuesta12;
	}




	public void setRespuesta12(int respuesta12) {
		this.respuesta12 = respuesta12;
	}




	public String getRespuesta12text() {
		return respuesta12text;
	}




	public void setRespuesta12text(String respuesta12text) {
		this.respuesta12text = respuesta12text;
	}




	public int getRespuesta14() {
		return respuesta14;
	}




	public void setRespuesta14(int respuesta14) {
		this.respuesta14 = respuesta14;
	}




	public int getRespuesta13() {
		return respuesta13;
	}




	public void setRespuesta13(int respuesta13) {
		this.respuesta13 = respuesta13;
	}




	public int getRespuesta15() {
		return respuesta15;
	}




	public void setRespuesta15(int respuesta15) {
		this.respuesta15 = respuesta15;
	}




	public String getRespuesta16() {
		return respuesta16;
	}




	public void setRespuesta16(String respuesta16) {
		this.respuesta16 = respuesta16;
	}


}
