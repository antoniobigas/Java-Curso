package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;


/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
area  p( p  a)( p  b)( p  c) 2
a b c
*/

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		y = new Triangle();
		x = new Triangle();
		
		
		System.out.println("Entre os valores de X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre os Valores de Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.b = sc.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangulo X área: %.4f%n", areaX);
		System.out.printf("Triangulo Y área: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área é: X");
		} else {
			System.out.println("A Maior área é: Y");
		}
		sc.close();
		
	}

}
