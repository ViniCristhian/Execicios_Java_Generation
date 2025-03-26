package java_prat_9;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1_Fila {

	public static void main(String[] args) {

		/*
		 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo
		 * string, para organizar uma fila por ordem de chegada dos Clientes de um
		 * Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 
		 * -- 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente. 
		 * -- 2: Listar todos os Clientes na fila 
		 * -- 3: Chamar (retirar) uma pessoa da fila 
		 * -- 0: O programa deve ser finalizado.
		 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao
		 * tentar retirar (chamar) um cliente da fila.
		 */

		Scanner scanner = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		
		int opcaoDesejada;
		
		boolean finalizarPrograma = true;
		
		while (finalizarPrograma) {
			
			System.out.println("\n*****************************************************************************");
			
			System.out.println("\n1: Adicionar um novo Cliente na fila.");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar uma pessoa da fila");
			System.out.println("0: O programa deve ser finalizado.");
			
			
			System.out.println("\n*****************************************************************************");
			
			System.out.print("Entre com a opção desejada: ");
			opcaoDesejada = scanner.nextInt();
			
			switch (opcaoDesejada) {
			case 1:
				adicionarPessaoAFila(fila, scanner);
				break;
				
			case 2:
				listarClientes(fila);
				break;
				
			case 3:
				chamarCliente(fila);
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
	
	private static void adicionarPessaoAFila(Collection<String> fila, Scanner scanner) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
		
		System.out.print("\nDigite o nome do Cliente: ");
		scanner.nextLine();
		
		fila.add(scanner.nextLine());
		
		System.out.println("\nCliente adicionado com sucesso!");
	}
	
	private static void listarClientes(Collection<String> fila) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
		
		if (fila.isEmpty()) {
			System.out.println("A Fila está vazia");
			return;
		}
		
		System.out.println("\nLista de clientes na fila: ");
		
		for (String cliente : fila) {
			System.out.println(cliente);
		}
		
		
	}
	
	private static void chamarCliente(Queue<String> fila) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
		
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia!");
			return;
		}

		System.out.println("Cliente chamado: " + fila.poll());
		
		System.out.println("\nClientes restantes na fila: ");
		
		for (String cliente : fila) {
			System.out.println(cliente);
		}
	}
	
}
