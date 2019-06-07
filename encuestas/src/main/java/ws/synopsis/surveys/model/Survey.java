package ws.synopsis.surveys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 *
 */
@Entity

public class Survey implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private int surveyid;
	
	private String ass;
	
	public Survey() {
		super();
	}
   
}
