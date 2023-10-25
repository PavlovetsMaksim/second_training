package edu.training.simpleapp.main;

public class Main08 {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		double c = 4;
		
		double res = ((b + Math.sqrt((b * b) + (4 * a * c)))/ (2 * a)) - ((a * a * a) * c + Math.pow(b, -2));
		
		System.out.println("res = " + res);

	}

}
