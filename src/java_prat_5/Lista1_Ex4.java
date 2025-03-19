package java_prat_5;

import java.util.Scanner;

public class Lista1_Ex4 {

	public static void main(String[] args) {
		
		Scanner leiaScanner = new Scanner(System.in);
		
		System.out.print("Nome do doador: ");
		String nomeDoador = leiaScanner.nextLine();
		
		System.out.print("Idade do doador: ");
		int idadeDoador = leiaScanner.nextInt();
		
		System.out.print("Primeira Doação (true/false): ");
		boolean primeiraSassao = leiaScanner.nextBoolean();
		
		aptoParaDoar(nomeDoador, idadeDoador, primeiraSassao);
		
		leiaScanner.close();
	}
	
	public static void aptoParaDoar(String nomeDoador, int idade, boolean primeiraSesao) {
		
		if (idade >= 18 && idade < 60) {
			System.out.println("\n" + nomeDoador + " está apto para doar sangue!");
			return;
		}
		
		if ((idade >= 60 && idade <= 69) && primeiraSesao == true) {
			System.out.println("\n" + nomeDoador + " está apto para doar sangue!");
			
		} else {
			System.out.println("\n" + nomeDoador + " não está apto para doar sangue!");
		}
	}

}