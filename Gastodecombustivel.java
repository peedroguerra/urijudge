package Algoritmos;

import java.util.Scanner;

public class Gastodecombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tempoV = sc.nextInt();
		int velocidadeM = sc.nextInt();
		double litros;

		litros = tempoV * velocidadeM / 12.0;

		System.out.printf("%.3f", litros);

		sc.close();
	}

}
