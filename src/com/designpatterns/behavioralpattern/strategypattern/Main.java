package com.designpatterns.behavioralpattern.strategypattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Context context = new Context();
		
		System.out.println("Please select one of the operation\n1) Addition\n2) Subtraction\n3) Multiplication\n");
		String operation = scanner.nextLine();
		
		System.out.print("Please enter first number: ");
        int firstNum = scanner.nextInt();
        
        System.out.print("Please enter second number: ");
        int secondNum = scanner.nextInt();
        
		switch(operation) {
		case "Addition": 
			context.setStrategy(new AdditionStrategy());
			break;
		case "Subtraction":
			context.setStrategy(new SubtractionStrategy());
			break;
		case "Multiplication":
			context.setStrategy(new MultiplicationStrategy());
			break;
		default:
			System.out.println("You have choosen wrong operation !!!");
		}
		
		System.out.println("\nResult is: " + context.executeStrategy(firstNum, secondNum));
	}

}
