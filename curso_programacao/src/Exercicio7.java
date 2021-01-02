package curso_programacao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		int num;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		num=sc.nextInt();
		if(num<0)
		{
			System.out.println("É negativo!");
		}
		else System.out.println("É positivo!");
		
		sc.close();
	}
	
		
}
