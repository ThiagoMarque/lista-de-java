package listaexercicio02;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario atual");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o valor do reajuste");
		float reajuste = sc.nextFloat();
		
		float novosalario = salario + (salario * reajuste / 100);
		System.out.println("O novo salario é :" + novosalario);
		
		
		
	}

}
