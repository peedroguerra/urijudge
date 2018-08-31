package Algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Media1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		
		double a = 3.5;
		double b = 7.5;
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media;
		
		media = (a * nota1 + b * nota2) / (a + b);
		
		System.out.printf("MEDIA = %.5f", media);
		
		
		sc.close();
	}

}
