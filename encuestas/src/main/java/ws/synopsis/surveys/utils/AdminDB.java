package ws.synopsis.surveys.utils;

import javax.persistence.EntityManager; 
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import ws.synopsis.surveys.model.Admin;

public class AdminDB {
	public static boolean checkCredentials(String username, String contrasena) {
		if(checkUsernameExists(username) == true) {
			if(checkcontrasenaMatches(username, contrasena) == true) return true;
		}
		return false;
	}
	
	public static boolean checkcontrasenaMatches(String username, String contrasena) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT e " +
							"FROM Admin as e " +
							"WHERE e.username = :username";
		TypedQuery<Admin> q = em.createQuery(qString, Admin.class);
		q.setParameter("username", username);
		try {
			if(q.getSingleResult().getContrasena().equals(contrasena)) return true;
			return false;
		} finally {
			em.close();
		}
	}
	
	public static boolean checkUsernameExists(String username) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT e.username " +
							"FROM Admin as e " +
							"WHERE e.username = :username";
		TypedQuery<String> q = em.createQuery(qString, String.class);
		q.setParameter("username", username);
		try {
			if(q.getSingleResult() != null) return true;
			return false;
		} finally {
			em.close();
		}
	}
	
	public static Admin getAdminByUsername(String username) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e " +
						"FROM Admin e " +
						"WHERE e.username = :username";
		TypedQuery<Admin> q = em.createQuery(qString, Admin.class);
		q.setParameter("username", username);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static String getPasswordByUsername(String username) {
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString =	"SELECT e.contrasena " +
							"FROM Admin as e " +
							"WHERE e.username = :username";
		TypedQuery<String> q = em.createQuery(qString, String.class);
		q.setParameter("username", username);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static boolean insertAdmin(Admin Admin) {
		boolean isSuccessful = false;
		
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(Admin);
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
	
	public static boolean mergeAdmin(Admin Admin) {
		boolean isSuccessful = false;

		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(Admin);
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
