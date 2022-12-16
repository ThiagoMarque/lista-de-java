package listaexercicio02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu aniversario : ");
		int ano = sc.nextInt();
		
		System.out.println("Digite quantos meses passou do seu aniversario :");
		int mes = sc.nextInt();
		
		System.out.println("Digite quantos dias se passou do seu aniversario : ");
		int dias = sc.nextInt();
		
		int idade = (ano*360) + (mes*30) + dias;
		 System.out.println("voce esta vivo a : " + idade);
		
		
		
	}

}
