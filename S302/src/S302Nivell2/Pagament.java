package S302Nivell2;

public class Pagament implements CallBack{

	public Pagament(int opcionPagar) {
		// TODO Auto-generated constructor stub
	 if (opcionPagar==1) {
		 
		 System.out.println(" 1-PayPal"); 
	 }else  if (opcionPagar==2) {
		 
		 System.out.println(" 2-Tarjeta de Credit"); 
	 }else  if (opcionPagar==3) {
		 
		 System.out.println("3- Número de Compte"); 
	 }
    
	}
	@Override
	public void pagament() {
		// TODO Auto-generated method stub
		
	}

}
