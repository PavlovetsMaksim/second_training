package edu.training.simpleapp.main;

public class Main16 {

	public static void main(String[] args) {
        int n = 1234;
        int temp = 1;

        while (n > 0){
        	temp = temp * (n % 10);
            n = n / 10;
        }

        System.out.println("Произведение цифр заданного числа = " + temp);

	}

}
