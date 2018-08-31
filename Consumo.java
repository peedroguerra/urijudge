package Algoritmos;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		double y = sc.nextDouble();

		double total;

		total = x / y;

		System.out.printf("%.3f km/l", total);

		sc.close();

	}

}
