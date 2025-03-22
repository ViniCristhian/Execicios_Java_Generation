package java_prat_6;

import java.util.Scanner;

public class Lista2_Ex3_While {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		 * inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		 * menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		 * leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		 */

		Scanner scanner = new Scanner(System.in);

		verificarIdade(scanner);

		scanner.close();
	}

	public static void verificarIdade(Scanner scanner) {

		int idades = 0;
		int pessoasMenor21 = 0;
		int pessoasMaior50 = 0;

		while (idades >= 0) {

			System.out.print("Entre com uma idade: ");
			idades = scanner.nextInt();

			if (idades < 21 && idades > 0) {
				pessoasMenor21++;
			}

			if (idades > 50) {
				pessoasMaior50++;
			}
		}

		System.out.println("\nO total de pessoas menor de 21 anos são: " + pessoasMenor21);
		System.out.println("O total de pessoas maior de 50 anos são: " + pessoasMaior50);
	}
}
