package com.epam.calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("calculator!!");
		boolean n = true;
		Scanner sc = new Scanner(System.in);
		while(n) {
			System.out.println("Operations available:-");
			System.out.println("ADDITION (+)");
			System.out.println("SUBTRACTION (-) ");
			System.out.println("MULTIPLICATION (*)");
			System.out.println("DIVISION (/)");
			System.out.println("Enter operands ");
			double x, y;
			x = sc.nextDouble();
			y = sc.nextDouble();
			System.out.println("Select an operator(+ - * /)");
			char choice = sc.next().charAt(0);
			double ans = 0;
			char rep;
			try {
				Operations op = new Operations();
			switch(choice) {
				case '+':
					ans = op.add(x,y);
					System.out.println("The sum = " +ans);
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou!");
						break;
					}
				case '-':
				    ans = op.subtract(x, y);
					System.out.println("The difference = " +ans);
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou!");
						break;
					}
				case '*':
				    ans = op.multiply(x, y);
					System.out.println("The product = " +ans);
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou!");
						break;
					}
				case '/':
				    ans = op.divide(x, y);
					System.out.println("The quotient = " +ans);
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou !!");
						break;
					}
				}
			} catch(Exception e) {
	        	System.out.println("Please enter a valid operator!");
			}
		}
	}

}
