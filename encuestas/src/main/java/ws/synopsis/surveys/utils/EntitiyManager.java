package ws.synopsis.surveys.utils;

import javax.persistence.*;

public class EntitiyManager {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("primary");
	
	public static EntityManagerFactory getEmFactory() {
		return emf;
	}
}
