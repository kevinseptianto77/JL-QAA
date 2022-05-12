package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
	    int firstnumb, secondnumb, result;

	    Scanner scan = new Scanner(System.in);

	    	try {
				System.out.println("Enter first number");
				firstnumb = Integer.parseInt(scan.nextLine());
				
			} catch (NumberFormatException  e) {
				System.out.println("Input Must be Number!");
				return;
			}
	   
			try {
				System.out.println("Enter second number");
				secondnumb = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Input Must be Number!");
				return;
			}
		    
	    	System.out.println("Choose an operator: +, -, *, or /");
		    operator = scan.next().charAt(0);
		    
		    switch (operator) {
		    
		      case '+':
		        result = firstnumb + secondnumb;
		        System.out.println(firstnumb + " + " + secondnumb + " = " + result);
		        break;

		      case '-':
		        result = firstnumb - secondnumb;
		        System.out.println(firstnumb + " - " + secondnumb + " = " + result);
		        break;

		      case '*':
		        result = firstnumb * secondnumb;
		        System.out.println(firstnumb + " * " + secondnumb + " = " + result);
		        break;

		      case '/':
		        result = firstnumb / secondnumb;
		        System.out.println(firstnumb + " / " + secondnumb + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

	    scan.close();
	  }
}
