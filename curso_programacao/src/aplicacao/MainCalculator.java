package aplicacao;

import java.util.Scanner;

import util.Calculator;

public class MainCalculator {

	public static void main(String[] args) {
		System.out.print("Enter radius: ");
		Scanner sc= new Scanner(System.in);
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		sc.close();

	}

}
