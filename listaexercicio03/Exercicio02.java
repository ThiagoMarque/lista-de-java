package listaexercicio03;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o comprimento");
	float comprimento = sc.nextFloat();
	
	System.out.println("Digite a largura");
	float largura = sc.nextFloat();
	
	System.out.println("Digite a altura");
	float altura = sc.nextFloat();
	
	float volume = comprimento * largura * altura;
	System.out.println("O volume da caixa :" + volume);
	
	
	
	}

}

//VOLUME=COMPRIMENTO * LARGURA * ALTURA.