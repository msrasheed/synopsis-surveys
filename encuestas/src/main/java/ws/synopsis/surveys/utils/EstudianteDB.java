package ws.synopsis.surveys.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import ws.synopsis.surveys.model.Coffeebean;
import ws.synopsis.surveys.model.User;
import ws.synopsis.surveys.servlets.Estudiante;

public class EstudianteDB {
	public static boolean checkCredentials(String username, String password) {
		if(checkUsernameExists(username) == true) {
			if(checkPasswordMatches(username, password) == true) return true;
		}
		return false;
	}
	
	public static boolean checkPasswordMatches(String username, String password) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT e " +
							"FROM Estudiante as e " +
							"WHERE e.username = :user";
		TypedQuery<Estudiante> q = em.createQuery(qString, Estudiante.class);
		q.setParameter("user", username);
		try {
			if(q.getSingleResult().getPassword().equals(password)) return true;
			return false;
		} finally {
			em.close();
		}
	}
	
	public static boolean checkUsernameExists(String username) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT username " +
							"FROM stuaccount " +
							"WHERE e.username  = :user";
		TypedQuery<String> q = em.createQuery(qString, String.class);
		q.setParameter("user", username);
		try {
			if(q.getSingleResult() != null) return true;
			return false;
		} finally {
			em.close();
		}
	}
	
	public static Estudiante getEstudianteByID(int id) { 
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e " +
						"FROM Estudiante e " +
						"WHERE e.userid = :id";
		TypedQuery<Estudiante> q = em.createQuery(qString, Estudiante.class);
		q.setParameter("id", id);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static String getPasswordByUsername(String username) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT e.password " +
							"FROM Estudiante as e " +
							"WHERE e.username = :user";
		TypedQuery<String> q = em.createQuery(qString, String.class);
		q.setParameter("user", username);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static String getUsernameByID(int id) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e.username " +
						"FROM Estudiante e " +
						"WHERE e.userid = :id";
		TypedQuery<String> q = em.createQuery(qString, String.class);
		q.setParameter("id", id);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static boolean insertEstudiante(User Estudiante) {
		boolean isSuccessful = false;
		System.out.println(isSuccessful);
		
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			System.out.println("try");
			trans.begin();
			System.out.println("begin");
			em.persist(Estudiante);
			System.out.println("persist");
			trans.commit();
			isSuccessful = true;
			System.out.println("commit");
		} catch (Exception e) {
			trans.rollback();
			isSuccessful = false;
		}finally {
			System.out.println(isSuccessful);
			em.close();
		}
		
		return isSuccessful;
	}
	
	public static boolean insertCoffee(Coffeebean result) {
		boolean isSuccessful = false;
		System.out.println(isSuccessful);
		
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			System.out.println("try");
			trans.begin();
			System.out.println("begin");
			em.persist(result);
			System.out.println("persist");
			trans.commit();
			isSuccessful = true;
			System.out.println("commit");
		} catch (Exception e) {
			trans.rollback();
			System.out.println(e);
			isSuccessful = false;
		}finally {
			System.out.println(isSuccessful);
			em.close();
		}
		
		return isSuccessful;
	}
	
	public static boolean mergeEstudiante(Estudiante Estudiante) {
		boolean isSuccessful = false;

		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(Estudiante);
			trans.commit();
			isSuccessful = true;
		} catch (Exception e) {
			trans.rollback();
			isSuccessful = false;
		}finally {
			em.close();
		}
		
		return isSuccessful;
	}

}
