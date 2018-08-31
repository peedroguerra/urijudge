package Algoritmos;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		DecimalFormat formatador = new DecimalFormat("0.0");

		double a = sc.nextDouble();
		a = Double.valueOf(formatador.format(a));

		double b = sc.nextDouble();
		b = Double.valueOf(formatador.format(b));

		double c = sc.nextDouble();
		c = Double.valueOf(formatador.format(c));

		double triangulo;
		double circulo;
		double pi = 3.14159;
		double trapezio;
		double quadrado;
		double retangulo;

		triangulo = a * c / 2;

		circulo = pi * Math.pow(c, 2);

		trapezio = ((a + b) / 2) * c;

		quadrado = Math.pow(b, 2);

		retangulo = a * b;

		System.out.printf("TRIANGULO: %.3f", triangulo);
		System.out.println();
		System.out.printf("CIRCULO: %.3f", circulo);
		System.out.println();
		System.out.printf("TRAPEZIO: %.3f", trapezio);
		System.out.println();
		System.out.printf("QUADRADO: %.3f", quadrado);
		System.out.println();
		System.out.printf("RETANGULO: %.3f", retangulo);

		sc.close();
	}

}
