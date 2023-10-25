package edu.training.simpleapp.main;

public class Main10 {

	public static void main(String[] args) {
		double x = 30;
		double y = 60;
		
		double res;
		
		res = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		
		System.out.println("res = " + res);

	}

}
