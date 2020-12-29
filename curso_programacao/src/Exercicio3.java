package curso_programacao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D.
		A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		int A=0,B=0,C=0,D=0,i,DIFERENCA=0;
		Scanner sc= new Scanner(System.in);
		for(i=0;i<=3;i++)
		{
			System.out.println("Digite o número");	
			if(i==0) A=sc.nextInt();
			
			if(i==1) B=sc.nextInt();
			
			if(i==2) C=sc.nextInt();
			
			else if(i==3) D=sc.nextInt();
				
		}
		
		DIFERENCA=(A*B)-(C*D);
		System.out.println("A diferença é: "+DIFERENCA);
		sc.close();
				
	}
	

}
