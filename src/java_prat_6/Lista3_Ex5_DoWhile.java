package java_prat_6;

import java.util.Scanner;

public class Lista3_Ex5_DoWhile {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		 * o número zero seja digitado. Ao final, mostre na tela a soma de todos os
		 * números digitados, que sejam positivos.
		 */

		Scanner scanner = new Scanner(System.in);

		SomarNumerosPositivos(scanner);

		scanner.close();
	}

	public static void SomarNumerosPositivos(Scanner scanner) {

		int numeros = 0;
		int somaNumerosPositivos = 0;

		do {

			System.out.print("Digite um número: ");
			numeros = scanner.nextInt();

			if (numeros > 0) {
				somaNumerosPositivos += numeros;
			}

		} while (numeros != 0);

		System.out.println("\nSoma dos números positivos é: " + somaNumerosPositivos);
	}
}
