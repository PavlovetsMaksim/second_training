package edu.training.simpleapp.main;

public class Main17 {

	public static void main(String[] args) {
		double n1 = 3;
        double n2 = -7;

        double avgA = (Math.pow(n1, 3) + Math.pow(n2, 3)) / 2;
        double avgG = Math.sqrt(Math.abs(n1) * Math.abs(n2));

        System.out.println("Среднее арифметическое кубов чисел = " + avgA);
        System.out.println("Среднее геометрическое модулей чисел = " + avgG);

	}

}
