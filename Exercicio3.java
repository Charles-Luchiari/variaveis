package JavaTech;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o salario bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o desconto: ");
		descontos = leia.nextFloat();

		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("Salario Liquido: %.2f", salarioLiquido);

	}

}
