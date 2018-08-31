package Algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		int numero = sc.nextInt();
		int vlrHoras = sc.nextInt();
		double qntHoras = sc.nextDouble();
		double salario;

		salario = qntHoras * vlrHoras;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();
	}

}
