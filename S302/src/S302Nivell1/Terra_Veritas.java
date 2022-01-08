package S302Nivell1;

public class Terra_Veritas extends Observador {

	double valor_accions=5.5;
	
	
	public Terra_Veritas(Borsa borsa) {
		this.borsa = borsa;
		this.borsa.agregar(this);
	}


	@Override
	public void actualizar() {
		if(borsa.getEstat()<valor_accions) {
            System.out.println("les accions han baixat: " + (valor_accions-borsa.getEstat())+" punts");
        }else if(borsa.getEstat()>valor_accions){
            System.out.println("les accions han pujat: " + (borsa.getEstat()-valor_accions)+" punts");
        }else {
            System.out.println("les accions no han canviat");
        }
		
	}

}
