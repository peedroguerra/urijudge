package Algoritmos;

import java.util.Scanner;

public class Omaior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorAB;
		int maiorABC;
		
		maiorAB = (a + b + Math.abs(a - b)) / 2;
		
		maiorABC = (c + maiorAB + Math.abs(c - maiorAB)) / 2;
		
		System.out.println(maiorABC + " eh o maior");
		
		
		sc.close();
	}

}
