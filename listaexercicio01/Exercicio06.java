package listaexercicio01;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[]args) {
	
	Scanner divisao = new Scanner (System.in);
	
	System.out.println("Digite um valor");
	int valor1 = divisao.nextInt();
	
	System.out.println("Digite um segundo valor");
	int valor2 = divisao.nextInt();
	
	int resultado = valor1 / valor2;
	
	System.out.println("O resultado da divisao é:" + resultado);
	
	}
}
