package Algoritmos;

import java.util.Scanner;

public class Conversaodetempo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.println(a / 3600 + ":" + (a % 3600) / 60 + ":" + a % 60);

		sc.close();

	}

}
