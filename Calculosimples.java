package Algoritmos;


import java.util.Locale;
import java.util.Scanner;

public class Calculosimples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		@SuppressWarnings("unused")
		int codigo1 = sc.nextInt();
		int numeroP1 = sc.nextInt();
		float valorP1 = sc.nextFloat();

		@SuppressWarnings("unused")
		int codigo = sc.nextInt();
		int numeroP = sc.nextInt();
		float valorP = sc.nextFloat();

		double total;

		total = (numeroP1 * valorP1) + (numeroP * valorP);

		System.out.println("VALOR A PAGAR: R$ %.2f" + total);

		sc.close();
	}

}
