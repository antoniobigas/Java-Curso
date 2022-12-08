package exercicio4_1;

import java.util.Scanner;
/*
 Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int x = sc.nextInt();
		// for inteiro i igual 1; i menor igual a x; i mais mais, se i porcentagem 2 nao é igual zero.
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
