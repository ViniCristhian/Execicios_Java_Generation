package java_prat_4;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		
		final Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicNoturno, horasExtras, desconto, salarioLiquido;
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicNoturno = leia.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Descontos: ");
		desconto = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicNoturno + (horasExtras * 5) - desconto;
		
		System.out.printf("\nSalário Liquido: %.2f", salarioLiquido);
		
		leia.close();
	}

}
