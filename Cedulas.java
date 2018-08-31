package Algoritmos;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n100 = 0, n50 = 0, n10 = 0, n20 = 0, n5 = 0, n2 = 0, n1 = 0, reais = 0;

		double a = sc.nextDouble();

		reais = (int) a;

		n100 = reais / 100;
		reais = reais % 100;

		n50 = reais / 50;
		reais = reais % 50;

		n20 = reais / 20;
		reais = reais % 20;

		n10 = reais / 10;
		reais = reais % 10;

		n5 = reais / 5;
		reais = reais % 5;

		n2 = reais / 2;
		reais = reais % 2;

		n1 = reais / 1;
		reais = reais % 1;

		System.out.println((int) a);
		System.out.printf("%d nota(s) de R$ 100,00", n100);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 50,00", n50);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 20,00", n20);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 10,00", n10);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 5,00", n5);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 2,00", n2);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 1,00", n1);

		sc.close();
	}

}
