package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco"); //Adiciona na posição 2 o nome Marco.
		
		System.out.println(list.size()); // ver o tamanho da lista
		

		for (String x : list) {
			System.out.println(x);
		};
		System.out.println("*---------------------------*");
		// list.remove("Anna"); //remove comparando Strings 
		// list.remove(1); //remove a posição 1 da lista Alex
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove por predicado, String usado neste exemplo remove todos que começam com M
		for (String x : list) {
			System.out.println(x);
		};
		System.out.println("*---------------------------*");
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		System.out.println("Index of Marco: "+ list.indexOf("Marco")); //Quando é nulo retorna -1
		System.out.println("*---------------------------*");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		//metodo acima para filtrar e trazer somente os nomes começados com A, função lambda.
		for (String x : result) {
			System.out.println(x);
		}; 
	  System.out.println("*---------------------------*");
	  
	  String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
	  System.out.println(name);
		
	}

}
