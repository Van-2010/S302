package S302Nivell1;

import java.util.ArrayList;
import java.util.List;

public class Borsa {
	
	private List<Observador>agents=new ArrayList<Observador>();
	private int estat;
	
	public void agregar(Observador observador) {
		agents.add(observador);
	}
	public int getEstat() {
		return estat;
	}
	public void setEstat(int estat) {
		this.estat = estat;
		notificar();
		
	}
	public void notificar() {
		agents.forEach(x->x.actualizar());
	}
	

}
