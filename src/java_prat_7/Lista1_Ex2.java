package java_prat_7;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1_Ex2 {

	public static void main(String[] args) {

		/*
		 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
		 * - Todos os elementos dos índices ímpares do vetor
		 * - Todos os elementos do vetor que são números pares
		 * - A Soma de todos os elementos do vetor 
		 * - A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numerosInteiros = new int[10];
		
		int[] numerosIndiceImpar = null;
		int contador_numerosIndiceImpares = 0;
		int indiceVetor_NumerosIndiceImpar = 0;
		
		int[] numerosPares = null;
		int contador_numerosPares = 0;
		int indiceVetor_NumerosPares = 0;
		
		int somaNumerosDoVetor = 0;
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			
			System.out.print("Escreva o " + (i + 1) + "º número: ");			
			numerosInteiros[i] = scanner.nextInt();
			
			if ((i % 2) != 0) {
				indiceVetor_NumerosIndiceImpar++;
				
			}
			
			if ((numerosInteiros[i] % 2) == 0) {
				indiceVetor_NumerosPares++;
				
			}
		}
		
		numerosIndiceImpar = new int[indiceVetor_NumerosIndiceImpar];
		
		numerosPares = new int[indiceVetor_NumerosPares];
		
		for (int j = 0; j < numerosInteiros.length; j++) {
			if ((j % 2) != 0) {
				contador_numerosIndiceImpares++;
				numerosIndiceImpar[contador_numerosIndiceImpares - 1] = numerosInteiros[j];
				
			}
		}
		
		for (int j = 0; j < numerosInteiros.length; j++) {
			if ((numerosInteiros[j] % 2) == 0) {
				contador_numerosPares++;
				numerosPares[contador_numerosPares - 1] = numerosInteiros[j];
				
			}
		}
			
		for (int j : numerosInteiros) {
			somaNumerosDoVetor += j;
			
		}
			
		
		
		System.out.println("\nNúmeros nos indices impar são: " + Arrays.toString(numerosIndiceImpar));
		
		System.out.println("\nTodos os elementos par do vetor são: " + Arrays.toString(numerosPares));
		
		System.out.println("\nA soma de todos os elementos do vetor é: " + somaNumerosDoVetor);
		
		double mediaDoVetor = (double) somaNumerosDoVetor / 10;
		
		System.out.println("\nA média de todos os elementos do vetor é: " + mediaDoVetor);
		
		scanner.close();
	}
}
