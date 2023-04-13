package JavaTech;

import java.util.Scanner;

public class main {

	public static void exercicio1(String[] args) {

		System.out.println("Digite o salario: ");
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		float salario = leia.nextFloat();

		System.out.println("Digite o abono: ");
		float abono = leia.nextFloat();

		float novoSalario = salario + abono;

		System.out.printf("Novo salario é %.2f", novoSalario);
	}

}
