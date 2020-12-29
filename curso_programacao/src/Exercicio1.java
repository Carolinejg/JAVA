package curso_programacao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, 
				//e depois mostrar na tela a soma desses números com uma 
				//mensagem explicativa, conforme exemploo
				Scanner sc= new Scanner(System.in);
				System.out.println("Digite o primeiro número inteiro");
				int num1=sc.nextInt();
				
				System.out.println("Digite o segundo número inteiro");
				int num2=sc.nextInt();
				
				int soma=num1+num2;
				System.out.println("SOMA = "+soma);

	}

}