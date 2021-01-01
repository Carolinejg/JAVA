package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class TesteComLocale {

	public static void main(String[] args) {
	}
	
	void teste1()
	{
		double valor;
		Scanner sc=new Scanner(System.in);
		valor=sc.nextDouble();
		System.out.println(valor);
		sc.close();
		
		/*leu com virgula e mostrou com ponto*/
	}
	
	void teste2()
	{
		double valor;
		Scanner sc=new Scanner(System.in);
		valor=sc.nextDouble();
		System.out.printf("%f",valor);
		sc.close();
		/*leu com virgula e mostrou com virgula*/
	}
	
	void teste3()
	{

		double valor;
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		valor=sc.nextDouble();
		System.out.printf("%f",valor);
		sc.close();
		/*leu com virgulae deu erro, só ler se for com ponto, e mostra o ponto */
		
	}
}
