package Algoritmos;

import java.util.Scanner;

public class Produtosimples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int prod;

		int a = sc.nextInt();
		int b = sc.nextInt();

		prod = a * b;

		System.out.println("PROD = " + prod);

		sc.close();

	}

}
