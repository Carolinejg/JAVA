package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.*/
		
		int codPec,i;
		double valor=0,quant,valorFinal=0;
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		for(i=1;i<3;i++)
		{
			System.out.printf("Digite o c�digo da pe�a %d\n",i);
			codPec=sc.nextInt();
			System.out.printf("Digite o n�mero de pe�as %d\n",i);
			quant=sc.nextInt();
			System.out.printf("Digite o valor unit�rio da pe�as %d\n",i);
			valor=sc.nextDouble();
			valorFinal=valorFinal+(quant*valor);
		    
			
			
			
		}
		
		System.out.printf("Valor a pagar R$ %.2f\n",valorFinal);
		
		sc.close();


	}

}
