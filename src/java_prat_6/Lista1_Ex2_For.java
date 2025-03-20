package java_prat_6;

import java.util.Scanner;

public class Lista1_Ex2_For {

	public static void main(String[] args) {
		
		/* Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela 
		 * quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		contadorParesEInpares(scanner);
		
		scanner.close();		
	}
	
	public static void contadorParesEInpares(Scanner scanner) {
		
		int par = 0;
		int impar = 0;
		int numeros;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Digite o "+ i + "º numero: ");
			
			numeros = scanner.nextInt();
			
			if ((numeros % 2) == 0) {
				par++;
				
			} else {
				impar++;
				
			}
		}
		
		System.out.println("\nTotal de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
	}
}
