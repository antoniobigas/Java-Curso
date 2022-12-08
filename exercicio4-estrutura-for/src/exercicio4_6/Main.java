package exercicio4_6;

import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de N ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println("O valor dos divisores de N são: "+ i);
			}
		}
		
		sc.close();
	}

}
