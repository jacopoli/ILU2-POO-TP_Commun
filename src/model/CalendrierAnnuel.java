package model;


public class CalendrierAnnuel {
	private Mois[] calendrier=new Mois[12];
	
	public CalendrierAnnuel() {
		String[] nomMois= {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août",
				"Septembre" , "Octobre", "Novembre","Décembre"};
		int[] joursParMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i=0; i<12; i++) {
			calendrier[i]=new Mois(nomMois[i], joursParMois[i]);
		}
	}
	
	public Boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public Boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			try {
				calendrier[mois-1].reserver(jour);
			} catch (IllegalStateException e) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	private static class Mois {
		 private String nom;
		 private Boolean[] jours;
		 
		 private Mois(String nom, int nbJours) {
			 this.nom=nom;
			 jours=new Boolean[nbJours];
			 for (int i=0; i<nbJours; i++)
				 jours[i]=false;
		 }
		 
		 private Boolean estLibre(int jour) {
			 return ! this.jours[jour-1];
		 }
		 
		 private void reserver(int jour) {
			 if (estLibre(jour)) {
				 jours[jour-1]=true;
			 }
			 throw new IllegalStateException();
		 }
	}
	
	
}
