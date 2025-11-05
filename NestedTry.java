package com.ExceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		int a = 10;
		int b =0;                                   //change the number to enter into inner try block
		int[] arr = {1,2,3};
		try {
			System.out.println("outer try block starts");
			int c = a/b;
			System.out.println(c);
			try{
				System.out.println("inner try block starts");
				int result = arr[4];
				System.out.println(result);
			
		}
        catch(ArrayIndexOutOfBoundsException v){
      	System.out.println("Enter the index less than length");
        }
		}
		catch(ArithmeticException e){
	    	System.out.println("Don't enter denominater as zero");
	    }
	finally{
	System.out.println("End of the program");
	}
	}
	}


