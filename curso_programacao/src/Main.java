import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.357894;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x); // formato, quantidade de casas decimais.
		System.out.printf("%.4f%n", x); 
		Locale.setDefault(Locale.US); // definir casas decimais
		System.out.printf("%.4f%n", x); 
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x); // concatenar varios elementos em um comando de escrita
		System.out.printf("%s Tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // recebe os valores da variavel e printa
	}
}