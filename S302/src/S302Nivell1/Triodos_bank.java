package S302Nivell1;

public class Triodos_bank extends Observador {

	double valor_accions=2.9;
	
	
	public Triodos_bank(Borsa borsa) {
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
