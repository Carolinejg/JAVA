package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		int codPec,i;
		double valor=0,quant,valorFinal=0;
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		for(i=1;i<3;i++)
		{
			System.out.printf("Digite o código da peça %d\n",i);
			codPec=sc.nextInt();
			System.out.printf("Digite o número de peças %d\n",i);
			quant=sc.nextInt();
			System.out.printf("Digite o valor unitário da peças %d\n",i);
			valor=sc.nextDouble();
			valorFinal=valorFinal+(quant*valor);
		    
			
			
			
		}
		
		System.out.printf("Valor a pagar R$ %.2f\n",valorFinal);
		
		sc.close();


	}

}
