package listaexercicio02; 

import java.util.Scanner;

public class Exercicio02 {
	
      public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de eleitores : ");
		int eleitores = sc.nextInt();
		
		System.out.println("Digite o numero numero de votos em branco :");
		int votosbrancos = sc.nextInt();
		
		System.out.println("Digite o numero de votos nulos : ");
		int votosnulos = sc.nextInt();
		
		System.out.println("Digite o numero de votos validos : ");
		int votosvalidos = sc.nextInt();
		
		int porcentagembrancos = 100 * votosbrancos/eleitores;
		 System.out.println("a porcentagem de votos brancos é :" + porcentagembrancos);
		 
		 int porcentagemnulos = 100 * votosnulos/eleitores;
		 System.out.println("a porcentagem de votos nulo é :" + porcentagemnulos);
		 
		 int porcentagemvalidos = 100 * votosvalidos/eleitores;
		 System.out.println("a porcentagem de votos validos é :" + porcentagemvalidos);
		
		
		
	}

}
