package S302Nivell2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Com vol pagar? : \n 1-PayPal \n 2-Tarjeta de Credit \n 3- Número de Compte");
		int opcionPago = entrada.nextInt();

		DemanarPagament demanarPagament = new DemanarPagament();
		Pagament pagamentFet = new Pagament(opcionPago);
		// demanem pagament a l'operació per defecte
		demanarPagament.pagamentFet(pagamentFet);

		DemanarPagament demanarPagament1 = new DemanarPagament();
		// passem la interfaç per implementar la nostra operació
		demanarPagament1.pagamentFet(new CallBack() {
		
			@Override
			public void pagament() {
				System.out.println("Pagament fet");
				
			}
		}
		);
	}
}
