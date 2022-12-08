package exercicio2_2;

import java.util.Scanner;

/* 
 Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		System.out.println("Digite um número: ");
		N = sc.nextInt();
		if (N % 2 == 0 ) {
				System.out.println("O número é par");
		}
		else {
				System.out.println("O Número é Impar");
		}
		sc.close();
	}

}
