package curso_programacao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
		
		int num;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		num=sc.nextInt();
		if(num<0)
		{
			System.out.println("� negativo!");
		}
		else System.out.println("� positivo!");
		
		sc.close();
	}
	
		
}
