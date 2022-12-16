package listaexercicio02;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.printf("Digite o valor do raio");
		double raio = sc.nextDouble();

		
		System.out.printf("Digite o valor da altura");
		double altura = sc.nextDouble();
		
		double volume = Math.PI *Math.pow(raio, 2) * altura;
		System.out.println("o volume da lata é :" + volume);
		
	}

}
