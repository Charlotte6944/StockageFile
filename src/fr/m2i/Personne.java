package fr.m2i;

import java.io.Serializable;

public class Personne implements Serializable {
	private String _nom;
	private String _prenom;
	
	public Personne (String _nom, String _prenom) {
		this.set_nom(_nom);
		this.set_prenom(_prenom);
	}

	public String get_nom() {
		return _nom;
	}
	public void set_nom(String _nom) {
		this._nom = _nom;
	}
	public String get_prenom() {
		return _prenom;
	}
	public void set_prenom(String _prenom) {
		this._prenom = _prenom;
	}
	
	@Override
	public String toString() {
		StringBuffer sb =  new StringBuffer() ;
		return sb.append(get_nom()).append(" ").append(get_prenom()).toString() ;
	}
	
}
