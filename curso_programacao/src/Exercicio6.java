package curso_programacao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.*/
		
		double A,B, C,PI=3.14159;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		A=sc.nextDouble();
		
		System.out.println("Digite o valor de B");
		B=sc.nextDouble();

		System.out.println("Digite o valor de C");
		C=sc.nextDouble();
		
		System.out.printf("A �rea do tri�ngulo ret�ngulo �: %.3f\n",A*C/2); 
		System.out.printf("A �rea do c�rculo �: %.3f\n",PI*(C*C));
		System.out.printf("A �rea do trap�zio �: %.3f\n",(A+B)*C/2);
		System.out.printf("A �rea do quadrado �: %.3f\n",B*B);
		System.out.printf("A �rea do ret�ngulo �: %.3f\n",A*B);
		
		sc.close();
		
	}

}
