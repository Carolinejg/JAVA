package curso_programacao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, 
		//e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos
		
		double raio, area,pi=3.14159;
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o raio");
		raio=sc.nextDouble();
		area=pi*((raio)*(raio));
		
		System.out.println("Área= %.2f%n"+area);
		 sc.close();
		

	}

}
