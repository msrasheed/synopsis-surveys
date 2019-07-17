package ws.synopsis.surveys.utils;

import javax.persistence.*;
/*
 * This is creates an entity manager factory for use in EstudianteDB, InstructorDB, and AdminDB.
 */
public class EntityMan {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("primary");
	
	public static EntityManagerFactory getEmFactory() {
		return emf;
	}
}
