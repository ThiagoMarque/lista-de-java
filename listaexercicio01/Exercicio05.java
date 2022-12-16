package listaexercicio01;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[]args) {
		
		Scanner multiplicacao = new Scanner (System.in);
		
		System.out.println("Digite um valor");
		int valor1 = multiplicacao.nextInt();
		
		System.out.println("Digite o segundo valor");
		int valor2 = multiplicacao.nextInt();
		
		int resultado = valor1 * valor2;
		
		System.out.println("O resultado da multiplicacao é: " + resultado);
	}

}
