package java_prat_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Lista2_Ex3_Set {

	public static void main(String[] args) {

		/*
		 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		 * Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via
		 * teclado 10 valores inteiros não repetidos e adicione-os individualmente na
		 * Collection Set. Em seguida, faça o que se pede: 
		 * -- Mostre na tela todos os elementos da Collection Set, utilizando a Classe 
		 * Iterator.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		HashSet<Integer> numerosInteiros = new HashSet<Integer>();
			
		for (int i = 0; i < 10; i++) {
			numerosInteiros.add(scanner.nextInt());
		}
		
		System.out.println("\nLista dos dados set: ");
		
		Iterator<Integer> iteratorNumerosInteiros = numerosInteiros.iterator();
		
		while (iteratorNumerosInteiros.hasNext()) {
			System.out.println(iteratorNumerosInteiros.next());	
		}
		
		scanner.close();
	}
}
