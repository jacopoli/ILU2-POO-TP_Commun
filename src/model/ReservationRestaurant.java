package model;

public class ReservationRestaurant extends Reservation {
	private int nuService;
	private int nuTable;

	public ReservationRestaurant(int jour, int mois, int nuService, int nuTable) {
		super(jour, mois);
		this.nuService=nuService;
		this.nuTable=nuTable;
	}
	
	private String getServiceString() {
		if (nuService==1) {
			return "premier";
		}
		else
			return "deuxième";
	}
	
	public String toString() {
		return String.format("Le %d/%d\nTable %d pour le %s service.", getJour(), getMois(), nuTable, getServiceString());
	}

}
