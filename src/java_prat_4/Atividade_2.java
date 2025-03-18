package java_prat_4;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		final Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nMédia final: %.1f", media);
		
		leia.close();
	}
	
}
