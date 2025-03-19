package java_prat_5;

import java.util.Scanner;

public class Lista2_Ex7 {
	
	public static void main(String[] args) {
		
		Scanner leiaScanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float num1 = leiaScanner.nextFloat();
		
		System.out.print("Digite um outro número: ");
		float num2 = leiaScanner.nextFloat();
		
		System.out.print("Operação: ");
		int idOperacao = leiaScanner.nextInt();
		
		operacoes(idOperacao, num1, num2);
		
		leiaScanner.close();
	}
	
	public static void operacoes(int idOperacao, float num1, float num2) {
		
		switch (idOperacao) {
		
		case 1:
			System.out.printf("%.1f + %.1f = %.1f", num1, num2, (num1 + num2));
			break;
			
		case 2:
			System.out.printf("%.1f - %.1f = %.1f", num1, num2, (num1 - num2));
			break;
			
		case 3:
			System.out.printf("%.1f * %.1f = %.1f", num1, num2, (num1 * num2));
			break;
			
		case 4:
			System.out.printf("%.1f / %.1f = %.1f", num1, num2, (num1 / num2));
			break;
			
		default:
			System.out.println("Não temos essa operação.");
			break;
		}
	}
}
