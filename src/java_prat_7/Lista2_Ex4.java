package java_prat_7;

import java.util.Scanner;

public class Lista2_Ex4 {

	public static void main(String[] args) {

		/*
		 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes
		 * durante 4 bimestres de um ano. As 4 notas de cada participante serão
		 * armazenadas em uma linha de uma matriz de números reais, logo cada linha da
		 * matriz serão as notas de um participante. Em um vetor de números reais,
		 * armazene as médias de cada participante e exiba as médias de cada um na tela.
		 */

		Scanner scanner = new Scanner(System.in);

		double[][] notasAlunos = new double[10][4];

		double somaMedias = 0;
		double[] medias = new double[10];

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {

				System.out.print("Digite a nota do " + (j + 1) + "º bimestre do " + (i + 1) + "º aluno: ");
				notasAlunos[i][j] = scanner.nextDouble();

				somaMedias += notasAlunos[i][j];
			}
			
			medias[i] = somaMedias / 4;
			somaMedias = 0;
		}
		
		System.out.print("\nA média de cada aluno é: ");
		
		for (double d : medias) {
			System.out.printf("[%.1f] ", d);
		}

		scanner.close();
	}
}
