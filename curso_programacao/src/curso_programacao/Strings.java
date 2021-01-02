package curso_programacao;


import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		
	Strings obj=new Strings();	
	//obj.letrasMinusculas();
	//obj.letrasMaiusculas();
	//obj.eliminaEspaçoEmBranco();
	//obj.substring();
	//obj.substringLimitada();
	//obj.troca();
	//obj.trocaSubstring();
	//obj.primeiraOcorrencia();
	//obj.ultimaOcorrencia();
	obj.separa();
	
	
	}
	
	void letrasMinusculas()
	{
		String original="abcde FGHIJ ABDE eddsi DJe";
		String novo=original.toLowerCase();
		System.out.println(novo);
	}
	
	void letrasMaiusculas()
	{
		String original="abcde FGHIJ ABDE eddsi DJe";
		String novo=original.toUpperCase();
		System.out.println(novo);
	}
	
	void eliminaEspaçoEmBranco()
	{
		String original="  abcde FGHIJ ABDE eddsi DJe  ";
		System.out.println("-"+original+"-");
		String novo=original.trim();
		System.out.println("-"+novo+"-");
	}
	
	void substring()
	{
		String original="abcde FGHIJ ABDE eddsi DJe";
		String novo=original.substring(3);
		System.out.println(novo);
	}
	
	void substringLimitada() 
	{
		String original="abcde FGHIJ ABDE eddsi DJe";
		String novo=original.substring(3,10);
		System.out.println(novo);
	}
	
	void troca()
	{
		String original="abcde FGHIJ ABDE eddsi DJe";
		String novo=original.replace("d","y");
		System.out.println(novo);
	}
	
	void trocaSubstring()
	{
		String original="abcde FGHIJ ABDE eddsi DJe";
		String novo=original.replace("abc","carol");
		System.out.println(novo);
	}
	
	void primeiraOcorrencia()
	{
		String original="abcde FGHIJ ABDE eddsi DJe";
		int novo=original.indexOf("ab");
		System.out.println(novo);
	}
	
	void ultimaOcorrencia()
	{
		String original="abcde FGHIJ abcDE eddsi DJe";
		int novo=original.lastIndexOf("bc");
		System.out.println(novo);
	}
	
	void separa()
	{
		String original="caroline souza santos";
		String[] novo=original.split(" ");//o marcador de sepraçâo nesse exemplo é um espaço
		String posicao1=novo[0];
		String posicao2=novo[1];
		String posicao3=novo[2];
		
		System.out.println(posicao1);
		System.out.println(posicao2);
		System.out.println(posicao3);
	}
}
