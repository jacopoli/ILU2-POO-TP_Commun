package model;

public abstract class Formulaire <E> {
	
	private int jour;
	private int mois;
	private E entiteReservee;

	public Formulaire(int jour, int mois) {
		this.jour=jour;
		this.mois=mois;
	}

}
