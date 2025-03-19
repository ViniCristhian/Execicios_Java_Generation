package java_prat_5;

import java.util.Scanner;

public class Lista2_Ex5 {

	public static void main(String[] args) {
		
		Scanner leiaScanner = new Scanner(System.in);
		
		System.out.print("código do Pruduto: ");
		int idProduto = leiaScanner.nextInt();
		
		System.out.print("Quantidade: ");
		int quantProd = leiaScanner.nextInt();
		
		pedidoCliente(idProduto, quantProd);

		leiaScanner.close();
	}
	
	public static void pedidoCliente(int idProduto, int quantProduto) {
		
		switch (idProduto) {
		
		case 1:
			System.out.println("\nProduto: Cachorro Quente");
			System.out.printf("Valor: R$ %.2f", quantProduto * 10.00);
			break;

		case 2:
				System.out.println("\nProduto: X-Salada");
				System.out.printf("Valor: R$ %.2f", quantProduto * 15.00);
				break;
				
		case 3:
				System.out.println("\nProduto: X-Bacun");
				System.out.printf("Valor: R$ %.2f", quantProduto * 18.00);
				break;
				
		case 4:
				System.out.println("\nProduto: Bauru");
				System.out.printf("Valor: R$ %.2f", quantProduto * 12.00);
				break;
				
		case 5:
				System.out.println("\nProduto: Refrigerante");
				System.out.printf("Valor: R$ %.2f", quantProduto * 8.00);
				break;
				
		case 6:
			System.out.println("\nProduto: Sudo de Laranja");
			System.out.printf("Valor: R$ %.2f", quantProduto * 13.00);
			break;
				
		default:
			System.out.println("Não temos esse produto");
			break;
		}
	}
}