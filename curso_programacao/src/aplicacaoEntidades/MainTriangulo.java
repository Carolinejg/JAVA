package aplicacaoEntidades;

import java.util.Scanner;

import entidades.Triangulo;

public class MainTriangulo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Triangulo x,y;
		
		x=new Triangulo();
		y=new Triangulo();
		
		System.out.println("Digite as informações do triangulo 1");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		
		System.out.println("Digite as informações do triangulo 2");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		
		System.out.println("Area do triangulo 1" + x.area());
		System.out.println("Area do trinangulo 2" + y.area());
		
		
	}

}
