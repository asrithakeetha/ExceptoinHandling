package com.ExceptionHandling;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	try{
	System.out.println("Enter a value");
	int a = sc.nextInt();
	System.out.println("Enter b value");
	int b = sc.nextInt();
	System.out.println(a/b);
	System.out.println("I'm from try block");
	}
    catch(ArithmeticException e) {
	System.out.println("Enter non zero value");
	}
    finally {
    	System.out.println("I'm fromm finally block");
    }
    }
	}

