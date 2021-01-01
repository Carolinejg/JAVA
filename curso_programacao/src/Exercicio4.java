package curso_programacao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.*/
		
		int funcionario_num;
		float horas;
		double salario,valor;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o número do funcionario");
		funcionario_num=sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas");
		horas=sc.nextFloat();
		
		System.out.println("Digite o valor por horas trabalhadas");
		valor=sc.nextDouble();
		
		salario=horas*valor;
		
		System.out.println("Número= "+funcionario_num);
		System.out.printf("Salário= R$ %.2f%n",salario);

		sc.close();
	}

}
