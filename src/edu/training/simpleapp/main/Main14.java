package edu.training.simpleapp.main;

public class Main14 {

	public static void main(String[] args) {
		//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
		double R = 6;
		
		//длина окружности
		double P = 2 * Math.PI * R;
		
		//площадь
		double S = Math.PI * (R * R);
		
		System.out.println("P = " + P + "\nS = " + S);

	}

}
