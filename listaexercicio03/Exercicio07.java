package listaexercicio03;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a cotação dolar :");
	double valora = sc.nextDouble();
	
	System.out.println("Digite quantos dolar tem : ");
	double valorb = sc.nextDouble();
	
	System.out.println("Digite quantos dolar tem : ");
	double valorc = sc.nextDouble();
	
	double soma = valora + valorb + valorc; 
	
	double quadrado = Math.pow(soma, 2); 
	
	System.out.println("A soma dos quadrados é : " + quadrado);
	
	}
}
