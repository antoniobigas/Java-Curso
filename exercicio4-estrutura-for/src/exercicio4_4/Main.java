package exercicio4_4;

import java.util.Scanner;

/*
 Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de n");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Informe o numero de x");
			int x = sc.nextInt();
			System.out.println("Informe o valor de y");
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("O valor da divisão é %.1f%n", div);
			}
		}
		
		sc.close();
	}

}
