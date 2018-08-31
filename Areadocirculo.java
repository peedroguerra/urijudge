package Algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Areadocirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double n = 3.14159;
		double area;

		double raio = sc.nextDouble();

		area = n * Math.pow(raio, 2);

		System.out.printf("A=%.4f", area);

		sc.close();

	}

}
