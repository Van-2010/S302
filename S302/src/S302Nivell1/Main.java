package S302Nivell1;

public class Main {
	
	public static void main(String[] args) {
		Borsa borsa=new Borsa();
		
		new Societe_Generale(borsa);
		new Triodos_bank(borsa);
		new Terra_Veritas(borsa);
		
		System.out.println("Activitat de les accions:");
	    borsa.setEstat(3);
	    System.out.println("------------------------------");
	    System.out.println("Activitat de les accions:");
	    borsa.setEstat(7);
	}

}
