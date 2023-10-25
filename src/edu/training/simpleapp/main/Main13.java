package edu.training.simpleapp.main;

public class Main13 {

	public static void main(String[] args) {
		double x1 = 2;
		double x2 = 5;
		double x3 = 7;
		
		double y1 = 9;
		double y2 = 12;
		double y3 = 18;
		
		double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		
		//периметр
		double P = a + b + c;
		
		//полупериметр
		double p2 = P / 2;
		
		//площадь
		double S = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
		
		System.out.println("P = " + P + "\nS = " + S);

	}

}
