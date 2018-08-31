package Algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double notaA = 2.0;
		double notaB = 3.0;
		double notaC = 5.0;
		double media;

		media = (notaA * a + notaB * b + notaC * c) / (notaA + notaB + notaC);

		System.out.printf("MEDIA = %.1f", media);

		sc.close();
	}

}
