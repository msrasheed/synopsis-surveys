package ws.synopsis.surveys.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//This is the java bean for responses to the redhat questionnaire. 
@Entity
@Table(name = "redhatsurvey")
public class Redbean implements Serializable {
		//private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column(name="pregunta1")
		
		private int pregunta1; 
		private int pregunta2;
		private int pregunta3;
		private int pregunta4;
		private int pregunta5;
		private int pregunta6;
		private int pregunta7;
		private int pregunta8;
		private int pregunta9;
		private int pregunta10;
		private int pregunta11;
		private int pregunta12;
		private String mejoraria12;
		private int pregunta13;
		private int pregunta14;
		private int pregunta15;
		private String pregunta16;
		
		public Redbean() {
			super();
		}
	
		public Redbean(int pregunta1, int pregunta2, int pregunta3, int pregunta4, int pregunta5, int pregunta6, int pregunta7, int pregunta8, int pregunta9, int pregunta10, int pregunta11, int pregunta12, String mejoraria12, int pregunta13, int pregunta14, int pregunta15, String pregunta16) {
			
			this.pregunta1= pregunta1;
			this.pregunta2= pregunta2;
			this.pregunta3= pregunta3;
			this.pregunta4= pregunta4;
			this.pregunta5= pregunta5;
			this.pregunta6= pregunta6;
			this.pregunta7= pregunta7;
			this.pregunta8= pregunta8;
			this.pregunta9= pregunta9;
			this.pregunta10= pregunta10;
			this.pregunta11= pregunta11;
			this.pregunta12= pregunta12;
			this.mejoraria12= mejoraria12;
			this.pregunta13= pregunta13;
			this.pregunta14= pregunta14;
			this.pregunta15= pregunta15;
			this.pregunta16= pregunta16;
					
		}

		public int getPregunta1() {
			return pregunta1;
		}

		public void setPregunta1(int pregunta1) {
			this.pregunta1 = pregunta1;
		}

		public int getPregunta2() {
			return pregunta2;
		}

		public void setPregunta2(int pregunta2) {
			this.pregunta2 = pregunta2;
		}

		public int getPregunta3() {
			return pregunta3;
		}

		public void setPregunta3(int pregunta3) {
			this.pregunta3 = pregunta3;
		}

		public int getPregunta4() {
			return pregunta4;
		}

		public void setPregunta4(int pregunta4) {
			this.pregunta4 = pregunta4;
		}

		public int getPregunta5() {
			return pregunta5;
		}

		public void setPregunta5(int pregunta5) {
			this.pregunta5 = pregunta5;
		}

		public int getPregunta6() {
			return pregunta6;
		}

		public void setPregunta6(int pregunta6) {
			this.pregunta6 = pregunta6;
		}

		public int getPregunta7() {
			return pregunta7;
		}

		public void setPregunta7(int pregunta7) {
			this.pregunta7 = pregunta7;
		}

		public int getPregunta8() {
			return pregunta8;
		}

		public void setPregunta8(int pregunta8) {
			this.pregunta8 = pregunta8;
		}

		public int getPregunta9() {
			return pregunta9;
		}

		public void setPregunta9(int pregunta9) {
			this.pregunta9 = pregunta9;
		}

		public int getPregunta10() {
			return pregunta10;
		}

		public void setPregunta10(int pregunta10) {
			this.pregunta10 = pregunta10;
		}

		public int getPregunta11() {
			return pregunta11;
		}

		public void setPregunta11(int pregunta11) {
			this.pregunta11 = pregunta11;
		}

		public int getPregunta12() {
			return pregunta12;
		}

		public void setPregunta12(int pregunta12) {
			this.pregunta12 = pregunta12;
		}

		public String getMejoraria12() {
			return mejoraria12;
		}

		public void setMejoraria12(String mejoraria12) {
			this.mejoraria12 = mejoraria12;
		}

		public int getPregunta13() {
			return pregunta13;
		}

		public void setPregunta13(int pregunta13) {
			this.pregunta13 = pregunta13;
		}

		public int getPregunta14() {
			return pregunta14;
		}

		public void setPregunta14(int pregunta14) {
			this.pregunta14 = pregunta14;
		}

		public int getPregunta15() {
			return pregunta15;
		}

		public void setPregunta15(int pregunta15) {
			this.pregunta15 = pregunta15;
		}

		public String getPregunta16() {
			return pregunta16;
		}

		public void setPregunta16(String pregunta16) {
			this.pregunta16 = pregunta16;
		}
		
		
}
