package com.ExceptionHandling;

public class ArayAccess {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
     try {
     System.out.println(arr[10]);
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("Enter the array index less than length");
    	 }
     finally {
    	 System.out.println("Array operation completed");
     }
	}
}
