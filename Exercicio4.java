package JavaTech;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, calculo;

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextFloat();
		System.out.println("Digite as terceiro numero: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o quarto numero:: ");
		n4 = leia.nextFloat();

		calculo = (n1 * n2) - (n3 * n4);

		System.out.printf("Diferença: %.2f", calculo);

	}

}
