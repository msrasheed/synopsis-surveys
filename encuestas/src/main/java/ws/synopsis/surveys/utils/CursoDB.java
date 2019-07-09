package ws.synopsis.surveys.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import ws.synopsis.surveys.model.Curso;

public class CursoDB {
	
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
	


}

