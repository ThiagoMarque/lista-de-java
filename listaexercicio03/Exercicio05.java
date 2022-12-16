package listaexercicio03;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a cotação dolar :");
	float cotacao = sc.nextFloat();
	
	System.out.println("Digite quantos real tem : ");
	float real = sc.nextFloat();
	
	
	float dolar = cotacao * real ;
	System.out.println("O valor é :" + dolar);
	
	}

}
