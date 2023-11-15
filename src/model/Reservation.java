package model;

public abstract class Reservation {
	
	private int jour;
	private int mois;
	
	protected Reservation(int jour, int mois) {
		this.jour=jour;
		this.mois=mois;
	}
	
	protected int getJour() {
		return jour;
	}
	
	protected int getMois() {
		return mois;
	}

}
