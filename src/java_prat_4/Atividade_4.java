package java_prat_4;

import java.util.Scanner;

public class Atividade_4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, resul;
		
		System.out.print("Numero 1: ");
		n1 = leia.nextFloat();
		
		System.out.print("Numero 2: ");
		n2 = leia.nextFloat();
		
		System.out.print("Numero 3: ");
		n3 = leia.nextFloat();
		
		System.out.print("Numero 4: ");
		n4 = leia.nextFloat();
		
		resul = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nDeferença: %.2f", resul);
		
		leia.close();
	}
	
}
