package listaexercicio03;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a cota��o dolar :");
	float cotacao = sc.nextFloat();
	
	System.out.println("Digite quantos dolar tem : ");
	float dolar = sc.nextFloat();
	
	
	float real = cotacao * dolar ;
	System.out.println("O valor � :" + real);
	
	}
}
