package exercicio1_4;

import java.util.Scanner;

/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int a, b, c, d, dif; 
		System.out.println("Informe o valor de A");
		a = sc.nextInt();
		System.out.println("Informe o valor de B");
		b = sc.nextInt();
		System.out.println("Informe o valor de C")
		c = sc.nextInt();
		System.out.println("Informe o valor de D");
		d = sc.nextInt();
		dif = (a * b - c * d);
		System.out.println("Diferenca = " + dif);
		
		
		
		sc.close();
	}

}
