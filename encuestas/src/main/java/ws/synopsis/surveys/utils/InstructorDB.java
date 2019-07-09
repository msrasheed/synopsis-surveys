package ws.synopsis.surveys.utils; 

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import ws.synopsis.surveys.model.Instructor;
import ws.synopsis.surveys.servlets.InsertInstructor;

public class InstructorDB {
	public static boolean checkCredentials(String username, String password) {
		if(checkUsernameExists(username) == true) {
			if(checkPasswordMatches(username, password) == true) return true;
		}
		return false;
	}
	
	public static boolean checkPasswordMatches(String username, String password) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT e " +
							"FROM Instructor as e " +
							"WHERE e.username = :user";
		TypedQuery<InsertInstructor> q = em.createQuery(qString, InsertInstructor.class);
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
		String qString =	"SELECT e.username " +
							"FROM Instructor as e " +
							"WHERE e.username = :user";
		TypedQuery<String> q = em.createQuery(qString, String.class);
		q.setParameter("user", username);
		try {
			if(q.getSingleResult() != null) return true;
			return false;
		} finally {
			em.close();
		}
	}
	
	public static Instructor getInstructorByUsername(String username) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e " +
						"FROM Instructor e " +
						"WHERE e.userid = :id";
		TypedQuery<Instructor> q = em.createQuery(qString, Instructor.class);
		q.setParameter("username", username);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static String getPasswordByUsername(String username) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT e.password " +
							"FROM Instructor as e " +
							"WHERE e.username = :user";
		TypedQuery<String> q = em.createQuery(qString, String.class);
		q.setParameter("user", username);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static boolean insertInstructor(Instructor Instructor) {
		boolean isSuccessful = false;
		
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			System.out.println("begin");
			em.persist(Instructor);
			System.out.println("persist");
			trans.commit();
			System.out.println("commit");
			isSuccessful = true;
			System.out.println(isSuccessful);
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
			isSuccessful = false;
		}finally {
			em.close();
		}
		
		return isSuccessful;
	}
	
	public static boolean mergeInstructor(InsertInstructor Instructor) {
		boolean isSuccessful = false;

		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(Instructor);
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
