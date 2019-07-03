package ws.synopsis.surveys.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coffeebreak")
public class Coffeebean implements Serializable {
		//private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column(name="curso")
		private String curso;
		private String instructor; 
		private int rate1;
		private int rate2;
		private int rate3;
		private int rate4;
		private int rate5;
		private String mejoraria;
		
		public Coffeebean() {
			super();
		}
		
		public Coffeebean(String curso, String instructor, int rate1, int rate2, int rate3, int rate4, int rate5,
				String mejoraria) {
			super();
			this.curso = curso;
			this.instructor = instructor;
			this.rate1 = rate1;
			this.rate2 = rate2;
			this.rate3 = rate3;
			this.rate4 = rate4;
			this.rate5 = rate5;
			this.mejoraria = mejoraria;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public String getInstructor() {
			return instructor;
		}

		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}

		public int getRate1() {
			return rate1;
		}

		public void setRate1(int rate1) {
			this.rate1 = rate1;
		}

		public int getRate2() {
			return rate2;
		}

		public void setRate2(int rate2) {
			this.rate2 = rate2;
		}

		public int getRate3() {
			return rate3;
		}

		public void setRate3(int rate3) {
			this.rate3 = rate3;
		}

		public int getRate4() {
			return rate4;
		}

		public void setRate4(int rate4) {
			this.rate4 = rate4;
		}

		public int getRate5() {
			return rate5;
		}

		public void setRate5(int rate5) {
			this.rate5 = rate5;
		}

		public String getMejoraria() {
			return mejoraria;
		}

		public void setMejoraria(String mejoraria) {
			this.mejoraria = mejoraria;
		}
				
		
	}

