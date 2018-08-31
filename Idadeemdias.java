package Algoritmos;

import java.util.Scanner;

public class Idadeemdias {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int ano, mes, dia;

		ano = idade / 365;
		idade = idade % 365;

		mes = idade / 30;
		idade = idade % 30;

		dia = idade / 1;
		idade = idade % 1;

		System.out.printf("%d ano(s)", ano);
		System.out.println();
		System.out.printf("%d mes(es)", mes);
		System.out.println();
		System.out.printf("%d dia(s)", dia);

		sc.close();
	}

}
