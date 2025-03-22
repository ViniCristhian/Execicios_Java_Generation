package java_prat_7;

import java.util.Scanner;

public class Lista1_Ex1 {

	public static void main(String[] args) {

		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		 * irá digitar um número e o programa deve exibir na tela a posição deste número
		 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		 * encontrado!” deve ser exibida na tela.
		 */

		Scanner scanner = new Scanner(System.in);

		int[] vetorDeInteiros = { 1, 2, 5, 7, 8, 3, 6, 9, 4, 10 };

		System.out.print("Escreva um número: ");
		int numeroDigitado = scanner.nextInt();

		for (int i = 0; i < vetorDeInteiros.length; i++) {
			
			if (numeroDigitado == vetorDeInteiros[i]) {
				System.out.println("O número digitado " + numeroDigitado + " está na " + (i + 1) + "º posição");
				break;
				
			}
			
			if (numeroDigitado != vetorDeInteiros[i] && i == (vetorDeInteiros.length - 1)) {
				System.out.println("O número " + numeroDigitado + " não foi entrado");
				
			}
		}

		scanner.close();
	}

}
