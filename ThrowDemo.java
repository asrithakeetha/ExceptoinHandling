package com.ExceptionHandling;

public class ThrowDemo {

	public void testException() {
		System.out.println("This is ThrowDemo method");
		//NullPointerException nullPointerException = new NullPointerException("This is throw message");
		throw new NullPointerException("This is throw message");
	}
	}