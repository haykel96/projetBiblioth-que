import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;

// Classe de gestion de Lecteur

public class Lecteur implements Serializable 
{
	
	private static final long serialVersionUID = 422L;
	
	// -----------------------------------------------
		//Attributs
	// -----------------------------------------------
	
                private Integer numLec;
		private String nomLec;
		private String prenomLec;
		private GregorianCalendar dateNaissance;
		private String adresse;
		private String tel;
	
	
	
	// -----------------------------------------------
		//Constructeur
	// -----------------------------------------------
		
		public Lecteur(int num,String nom, String prenom, GregorianCalendar dateNaissance, String adresse, String tel)
		{
			this.setNom(nomLec);
			this.setPrenom(prenomLec);
			this.setNumLecteur(numLec);
			this.setDateNaissance(dateNaissance);
			this.setAdresse(adresse);
			this.setTel(tel);
		}
		
// -----------------------------------------------
	// Public
// -----------------------------------------------
		
		// -----------------------------------------------
			//Getters
		// -----------------------------------------------
	
		public String getNom() {
			return nomLec;
		}

		public String getPrenom() {
			return prenomLec;
		}

		public Integer getNumLecteur() {
			return numLec;
		}
		
		public GregorianCalendar getDateNaissance() {
			return dateNaissance;
		}

		public String getAdresse() {
			return adresse;
		}

		public String getTel() {
			return tel;
		}
		// -----------------------------------------------
			// Methodes
		// -----------------------------------------------
		
		/*
		 * La m�thode afficherLecteur affiche l'ensemble des informations relatives � un lecteur.
		 */
		public void afficherLecteur()
		{
			System.out.println("Numero lecteur : " + this.getNumLecteur());
			System.out.println("Nom et prenom du lecteur: " + this.getNom() + " " + this.getPrenom());
			System.out.println("Age : " + this.calculAge() + " ans");
			System.out.println("Adresse : " + this.getAdresse());
			System.out.println("Telephone : " + this.getTel());
			EntreesSorties.afficherMessage("");
		}
		
		
		/*
		 * la m�thode calculAge permet de d�terminer l'dateNaissance des lecteurs grace a leur date de naissance
		 * et la date actuelle. De cette fa�on, il n'y a pas de mise a jour a faire sur l'dateNaissance des lecteurs.
		 */
		public Integer calculAge() {
			Integer age;
			GregorianCalendar dateNaissComp;
			GregorianCalendar dateActuelle = new GregorianCalendar();
			dateNaissComp = new GregorianCalendar(dateActuelle.get(GregorianCalendar.YEAR), this.dateNaissance.get(GregorianCalendar.MONTH), this.dateNaissance.get(GregorianCalendar.DATE));
			if(dateNaissComp.before(dateActuelle)){
				age=dateActuelle.get(GregorianCalendar.YEAR)-this.dateNaissance.get(GregorianCalendar.YEAR);
			}
			else{
				age=dateActuelle.get(GregorianCalendar.YEAR)-this.dateNaissance.get(GregorianCalendar.YEAR)-1;
			}
			return age;
		}
		
	
	
// -----------------------------------------------
	// Private
// -----------------------------------------------

		// -----------------------------------------------
			//Setters
		// -----------------------------------------------

		private void setNom(String nom) {
			this.nomLec = nom;
		}

		private void setPrenom(String prenom) {
			this.prenomLec = prenom;
		}
		
		private void setNumLecteur(Integer numLecteur) {
			this.numLec = numLecteur;
		}

		private void setDateNaissance(GregorianCalendar dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		private void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		private void setTel(String tel) {
			this.tel = tel;
		}
		
		
}