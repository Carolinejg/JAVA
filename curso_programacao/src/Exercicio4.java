package curso_programacao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
		decimais.*/
		
		int funcionario_num;
		float horas;
		double salario,valor;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o n�mero do funcionario");
		funcionario_num=sc.nextInt();
		
		System.out.println("Digite o n�mero de horas trabalhadas");
		horas=sc.nextFloat();
		
		System.out.println("Digite o valor por horas trabalhadas");
		valor=sc.nextDouble();
		
		salario=horas*valor;
		
		System.out.println("N�mero= "+funcionario_num);
		System.out.printf("Sal�rio= R$ %.2f%n",salario);

		sc.close();
	}

}
