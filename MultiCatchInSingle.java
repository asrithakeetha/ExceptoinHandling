package com.ExceptionHandling;

import java.util.Scanner;

public class MultiCatchInSingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String input = sc.nextLine();
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter c value");
        int c = sc.nextInt();
        try {
        	int num = Integer.parseInt(input);
        	System.out.println("You entered " + num );
        	int d = a/c;
        	System.out.println(d);
        }
        catch(NumberFormatException |ArithmeticException e){
        	System.out.println("Invalid input");
        	}

	}

}
