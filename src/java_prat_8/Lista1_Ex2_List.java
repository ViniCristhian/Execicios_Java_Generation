package java_prat_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1_Ex2_List {

	public static void main(String[] args) {

		/*
		 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		 * Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa
		 * deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e
		 * caso ele seja encontrado no ArrayList, exiba na tela a posição deste número
		 * na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a
		 * mensagem: O número NN não foi encontrado!
		 */

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();

		int[] numerosParaInicializacao = { 10, 3, 4, 8, 7, 9, 5, 2, 1, 6 };

		for (int i : numerosParaInicializacao) {
			numerosInteiros.add(i);
		}

		System.out.print("Digite um numero: ");
		Integer numeroDigitado = scanner.nextInt();

		if (numerosInteiros.contains(numeroDigitado)) {
			System.out.println("O numero " + numeroDigitado + " está na posição: " + numerosInteiros.indexOf(numeroDigitado));

		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");

		}

		scanner.close();
	}
}
