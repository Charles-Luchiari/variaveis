package JavaTech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome = "Charles";
		int idade = 25;
		double altura = 1.72;
		float nota1,nota2,nota3,media;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome participante: "+ nome);
		System.out.println("Idade do participante: "+ idade);
		System.out.println("Altura do participante: "+ altura);
		
		System.out.println("Entre com a primeira nota");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a segunda nota");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a terceira nota");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("A média foi: %.2f",media);
		
		nota1 = (float) Math.sqrt(nota2); //usa raiz quadrada
		nota2 = (float) Math.pow(nota3, 3); //usa a potencia
		//resto da divisão só funciona em numeros inteiros
		

	}

}
