package exercicio1_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US); // padrao US
			Scanner sc = new Scanner(System.in); // Scanner
			
			double largura = sc.nextDouble(); //Recebe entrada
			double comprimento = sc.nextDouble();
			double metroQuadrado = sc.nextDouble();
			
			double area = largura * comprimento;
			double preco = area * metroQuadrado;
			
			System.out.printf("AREA = %.2f%n", area);
			System.out.printf("Preco = %.2f%n", preco);
			
			
			
			sc.close();
	}

}
