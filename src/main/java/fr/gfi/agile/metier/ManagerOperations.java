package fr.gfi.agile.metier;

public class ManagerOperations {
	
	private static Double DONNEE_AFFICHEE = null;
	private static Double DONNEE_PRECEDENTE = null;
	private static String OPERATEUR =null;

	public static Double getDONNEE_AFFICHEE() {
		return DONNEE_AFFICHEE;
	}


	public static void setDONNEE_AFFICHEE(Double dONNEE_AFFICHEE) {
		DONNEE_AFFICHEE = dONNEE_AFFICHEE;
	}


	public static Double getDONNEE_PRECEDENTE() {
		return DONNEE_PRECEDENTE;
	}


	public static void setDONNEE_PRECEDENTE(Double dONNEE_PRECEDENTE) {
		DONNEE_PRECEDENTE = dONNEE_PRECEDENTE;
	}


	public static String getOPERATEUR() {
		return OPERATEUR;
	}


	public static void setOPERATEUR(String oPERATEUR) {
		OPERATEUR = oPERATEUR;
	}

	public static double additionner() {
		return DONNEE_AFFICHEE+DONNEE_PRECEDENTE;
	}
	
	public static double egal() {
		return 0;
	}

	public static double multiplier(double i, double j) {
		return i*j;
	}
	
	public double soustraire(double i, double j) {
		return i - j;
	}
	
}
