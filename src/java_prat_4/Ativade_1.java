package java_prat_4;

import java.util.Scanner;

public class Ativade_1 {

	public static void main(String[] args) {
		
		final Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		
		System.out.print("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nNovo salário: %.2f",novoSalario);
		
		leia.close();
	}

}
