package Algoritmos;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Distanciaentredoispontos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double p1;
		double p2;
		double distancia;

		p1 = x2 - x1;
		p2 = y2 - y1;

		distancia = Math.sqrt((p1 * p1) + (p2 * p2));

		System.out.printf("%.4f", distancia);

		sc.close();
	}

}
