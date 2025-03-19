package java_prat_5;

import java.util.Scanner;

public class Lista1_Ex2 {

	public static void main(String[] args) {
		
		Scanner leiaScanner = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		
		identNumero(leiaScanner.nextInt());
		
		leiaScanner.close();
	}
	
	public static void identNumero(int num) {
		
		if (num > 0 && ((num % 2) == 0)) {
			System.out.println("Número " + num + " é maior que zero e par");
			
		} else if (num > 0 && ((num % 2) != 0) ) {
			System.out.println("Número " + num + " é maior que zero e impar");
			
		} else if (num < 0 && ((num % 2) == 0) ) {
			System.out.println("Número " + num + " é menos que zero e par");
			
		} else if (num < 0 && ((num % 2) != 0) ) {
			System.out.println("Número " + num + " é menor que zero e impar");
			
		} else {
			System.out.println("O número digitado é zero");
		}
	}

}
