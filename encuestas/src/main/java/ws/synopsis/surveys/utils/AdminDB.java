package ws.synopsis.surveys.utils;

import java.util.List;

import javax.persistence.EntityManager; 
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import ws.synopsis.surveys.model.*;

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
	public static boolean insertAula(Aula Aula) {
		boolean isSuccessful = false;
		
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(Aula);
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
	public static boolean mergeAula(Aula Aula) {
		boolean isSuccessful = false;

		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(Aula);
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
	public static Aula getAulabyNombre(String nombre) { 
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e " +
						"FROM Aula as e " +
						"WHERE e.nombre = :nombre";
		TypedQuery<Aula> q = em.createQuery(qString, Aula.class);
		q.setParameter("nombre", nombre);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	
	public static boolean insertEmpresa(Empresa Empresa) {
		boolean isSuccessful = false;
		
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(Empresa);
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
	public static boolean mergeEmpresa(Empresa Empresa) {
		boolean isSuccessful = false;

		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(Empresa);
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
	public static Empresa getEmpresabyNombre(String nombre) { 
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e " +
						"FROM Empresa as e " +
						"WHERE e.nombre = :nombre";
		TypedQuery<Empresa> q = em.createQuery(qString, Empresa.class);
		q.setParameter("nombre", nombre);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}

	public static boolean insertCurso(Curso Curso) {
		boolean isSuccessful = false;
		
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.persist(Curso);
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
	public static boolean mergeCurso(Curso Curso) {
		boolean isSuccessful = false;

		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(Curso);
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
	public static Curso getCursobyCourseId(String courseId) { 
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e " +
						"FROM Curso as e " +
						"WHERE e.courseId = :courseId";
		TypedQuery<Curso> q = em.createQuery(qString, Curso.class);
		q.setParameter("courseId", courseId);
		try {
			return q.getSingleResult();
		} finally {
			em.close();
		}
	}
	public static List<Coffeebean> getCoffeebeansbyCurso(String curso) { 
		EntityManager em = EntityMan.getEmFactory().createEntityManager();
		String qString ="SELECT e " +
						"FROM Coffeebean as e " +
						"WHERE e.curso = :curso";
		TypedQuery<Coffeebean> q = em.createQuery(qString, Coffeebean.class);
		try {
			return q.getResultList();
		} finally {
			em.close();
		}
	}
}
