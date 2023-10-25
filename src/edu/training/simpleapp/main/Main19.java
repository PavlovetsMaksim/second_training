package edu.training.simpleapp.main;

public class Main19 {

	public static void main(String[] args) {
		double a = 3;

        double S = (a * a * Math.sqrt(3)) / 4;
        double h = a * Math.sqrt(3) / 2;
        double rIn = a / (2 * Math.sqrt(3));
        double rOut = a / Math.sqrt(3);

        System.out.println("Площадь треугольника = " + S);
        System.out.println("Высота = " + h);
        System.out.println("Радиус вписанной окружности = " + rIn);
        System.out.println("Радиус описанной окружности = " + rOut);

	}

}
