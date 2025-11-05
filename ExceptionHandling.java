package com.ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {   //here we can directly gives throws keyword for intimating java to get ready for the exception
		int a = 6,b=0;                          //throws ArithmeticException,I/OException {
		System.out.println(a);
		System.out.println(b);
		try{int c = a/b;                       //try is used to throw an exception.
		}
        catch(ArithmeticException e){          //catch will catch the exception thrown by try.And gives the info to handle. 
        	System.out.println(e);
        	throw e;                               //throw will directly throw the exception to the java if we don't want to handle it
        //	System.out.println("After throw no statement will executes");
        }
		
	
		finally {
			System.out.println("Block of code ended");
		}
	}

}
