package com.ExceptionHandling;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        String input = sc.nextLine();
	        System.out.println("Enter b number");
	        int a = sc.nextInt();
	        System.out.println("Enter c number");
	        int c = sc.nextInt();
	        try {
	        	int num = Integer.parseInt(input);
	        	System.out.println("You entered " + num );
	        	int d = a/c;
	        }
	        catch(NumberFormatException e){
	        	System.out.println("Invalid input");
	        	}
	        catch(ArithmeticException v) {
	        	System.out.println("Enter the valid input denominater should not be zero");
	        }
	        finally {
	        	System.out.println("Execution done");
	        }
		}

	}
