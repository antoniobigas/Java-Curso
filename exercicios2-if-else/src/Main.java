import java.util.Scanner;
/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		System.out.println("Digite um número: ");
		N = sc.nextInt();
		
		if (N < 0) {
				System.out.println("Negativo");
		}
		else { 
				System.out.println("Não Negatvio");
		}
		
	}

}
