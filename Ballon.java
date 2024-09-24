

import java.util.*;

public class Ballon {
	public static Vector<Ballon> mesInstances = new Vector<Ballon>();
	public String identificateur;
	public int taille;

	public Ballon(String identificateur, int taille) {
		this.identificateur = identificateur;
		this.taille = taille;
		//mesInstances.addElement(this);
	}

	public String toSting() {
		return ("identificateur = " +this.identificateur+"\n taill e= "+this.taille);
	}

}
