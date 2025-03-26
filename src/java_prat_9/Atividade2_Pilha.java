package java_prat_9;

import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2_Pilha {

	public static void main(String[] args) {
		
		/* Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para organizar
		 * a retirada de livros de uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		 * -- 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		 * -- 2: Listar todos os livros da Pilha
		 * -- 3: Retirar um livro da pilha 
		 * -- 0: O programa deve ser finalizado. 
		 *	Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar 
		 *	que a pilha está vazia.
		 */

		
		Scanner scanner = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		
		int opcaoDesejada;
		
		boolean finalizarPrograma = true;
		
		while (finalizarPrograma) {
			
			System.out.println("\n*****************************************************************************");
			
			System.out.println("\n1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da Pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: O programa deve ser finalizado.\n");
			
			
			System.out.println("*****************************************************************************");
			
			System.out.print("Entre com a opção desejada: ");
			opcaoDesejada = scanner.nextInt();
			
			switch (opcaoDesejada) {
			case 1:
				adicionarLivroAPilha(pilha, scanner);
				break;
				
			case 2:
				listarLivros(pilha);
				break;
				
			case 3:
				retirarLivro(pilha);
				break;
				
			case 0:
				finalizarPrograma = false;
				break;

			default:
				System.out.println("\nOpção desejada não compativel com o sistema");
				break;
			}
		}
		
		scanner.close();

	}
	
	private static void adicionarLivroAPilha(Stack<String> pilha, Scanner scanner) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
		
		System.out.print("\nDigite o nome do Livro: ");
		scanner.nextLine();
		
		pilha.push(scanner.nextLine());
		
		System.out.println("\nLivro adicionado com sucesso!");
	}

	private static void listarLivros(Collection<String> pilha) {

		for (int i = 0; i < 15; i++) {
			System.out.println();
		}

		if (pilha.isEmpty()) {
			System.out.println("A Pilha está vazia");
			return;
		}

		System.out.println("\nLista de livros na pilha: ");

		for (String cliente : pilha) {
			System.out.println(cliente);
		}

	}

	private static void retirarLivro(Stack<String> pilha) {

		for (int i = 0; i < 15; i++) {
			System.out.println();
		}

		if (pilha.isEmpty()) {
			System.out.println("A Pilha está vazia");
			return;
		}

		System.out.println("Livro retirado: " + pilha.pop());

		System.out.println("\nLivros restantes na pilha: ");

		for (String cliente : pilha) {
			System.out.println(cliente);
		}
	}
}
