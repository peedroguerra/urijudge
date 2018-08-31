package Algoritmos;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int tempo;

		tempo = d * 2;

		System.out.printf("%d minutos", tempo);

		sc.close();
	}

}
