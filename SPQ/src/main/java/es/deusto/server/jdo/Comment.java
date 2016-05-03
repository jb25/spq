package es.deusto.server.jdo;

import java.io.Serializable;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable

public class Comment implements Serializable {

	/**
	 * User implements Serializable to be transferred to the RMI client
	 */
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	String codR = null;
	String codM = null;
	String text = null;
	Member member = null;
	Restaurant restaurant = null;

	public Comment(String codComent, String codR, String codM, String text) {
		super();
		this.codR = codR;
		this.codM = codM;
		this.text = text;
	}

	public String getCodR() {
		return codR;
	}

	public void setCodR(String codR) {
		this.codR = codR;
	}

	public String getCodM() {
		return codM;
	}

	public void setCodM(String codM) {
		this.codM = codM;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return null;
	}

}
