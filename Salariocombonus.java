package Algoritmos;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Salariocombonus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		DecimalFormat formatador = new DecimalFormat("0.00");

		@SuppressWarnings("unused")
		String nome = sc.nextLine();
		double total;

		double salarioF = sc.nextDouble();
		salarioF = Double.valueOf(formatador.format(salarioF));

		double vendas = sc.nextDouble();
		vendas = Double.valueOf(formatador.format(vendas));

		total = vendas * 0.15 + (salarioF);

		System.out.printf("TOTAL = %.2f", total);

		sc.close();
	}

}
