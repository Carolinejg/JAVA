package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fa�a um programa para ler dois valores inteiros, 
		//e depois mostrar na tela a soma desses n�meros com uma 
		//mensagem explicativa, conforme exemplos
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro");
		int num1=sc.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro");
		int num2=sc.nextInt();
		
		int soma=num1+num2;
		System.out.println("SOMA = "+soma);
		

	}

}
