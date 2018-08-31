package Algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		double raio = sc.nextDouble();
		double volume;
		double pi = 3.14159;

		volume = (4 / 3.0) * pi * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f", volume);

		sc.close();
	}

}
