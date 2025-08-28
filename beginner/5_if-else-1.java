import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		/*
		1. Given whether a person is non-veg or not suggest 
		some sources of protien.
		  
		user please give true as the input if you are non-veg
		otherwise give false
		*/
		
		/*
		boolean non_veg = scn.nextBoolean();
		
		if(non_veg == true) {
			//person is non-veg
			System.out.println("Eggs, fish, chicken etc");
		}
		else {
			//person is veg
			System.out.println("Pulses, soya, paneer etc");
		}
		*/
		
		
		
		
		//2. Given age of a person, tell whether the vote can be casted or not
		/*
		int age = scn.nextInt();
		
		if(age >= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not Eligible for voting");
		}
		*/
		
		
		
		//3. Given temp of a person, tell whether the person has fever or Not
		/*
		Don't try to compare double with a float 
		Float should be compared with a float only (refer to line 54)
		Always work with double datatype for decimal numbers
		*/
		
		/*
		float temperature = scn.nextFloat();
		
		if(temperature >= 98.6f) {
			System.out.println("Fever!");
		}
		else {
			System.out.println("No fever :)");
		}
		*/
		
		
		
		
		/*
		if(1 > 3) {
			System.out.println("code1");
		}
		else {
			System.out.println("code2");
		}
		*/
		
		
		/*
		if(100 > 13) {
			System.out.println("code1");
		}
		if(110 > 15) {
			System.out.println("code2");
		}
		*/
		
		
		
		//quizzes 
		/*
		int a = 6, b = 6;
		
		if(a < b) { 
			System.out.println("a is larger" ) ;
		} 
		else { 
			System.out.println("b is larger") ;
		}
		*/
		
		
		/*
		if(5 > 4) {
			System.out.println("First if");
		}
		if(10 >= 6) {
			System.out.println("Second if");
		}
		*/
		
		
		/*
		if(true) {
			System.out.println("Hey there! ");
		}
		
		System.out.println(10*20);
		*/
		
		
		
		
		//4. Given temperature, give a detailed report
		/*
		double temp = scn.nextDouble();
		
		if(temp >= 98.0 && temp <= 98.9) {
			System.out.println("Normal :)");
		}
		if(temp >= 99.0 && temp <= 99.9) {
			System.out.println("Mild fever");
		}
		if(temp >= 100.0 && temp <= 102.0) {
			System.out.println("Fever");
		}
		if(temp > 102.0) {
			System.out.println("High fever");
		}
		if(temp >= 96.0 && temp <= 97.9) {
			System.out.println("Mild Hypothermia");
		}
		if(temp < 96.0) {
			System.out.println("Hypothermia");
		}
		*/
		
		
		
		//5. Given a number, check whether it is even or odd
		/*
		int N = scn.nextInt();
		
		if(N % 2 == 0) {
			//N is divisible by 2 -> N is even
			System.out.println(N + " is Even");
		}
		else {
			//N is not divisible by 2 -> N is odd 
			System.out.println(N + " is Odd");
		}
		*/
		
		
		
		//Difference between post and pre increments
		//post -> a++, pre -> ++a 
		
		/*
		int a = 10; //a = 12
		int b = a++ + ++a; //b = 10 + 12
		System.out.println(a);
		System.out.println(b);
		*/
		
		
		/*
		int a = 10; //a = 12
		int b = a++ + a++; //b = 10 + 11
		System.out.println(a);
		System.out.println(b);
		*/
		
		
		
		
		
		//Doubts
		
		// int a=3, b=8; 
		// boolean c = a > 5 && ++b > 6; 
		// System.out.println(b);
		
		
		// int a = 2 - - 7; //2 - (-7) -> 2 + 7
		// System.out.println(a);
		
		
		// System.out.println(-17 % 6);
		
		
		/*
		int a, b, c, d; 
		a = b = c = d = 20;
		 
		a += b -= c *= d /= 20; //right to left
		
		// d = 1
		// c = 20
		// b = 0
		// a = 20
		
		System.out. println("A = " + a + " B = " + b + " C = " + c + " D = " + d);
		*/
		
		
		//syntax mistake : compiler
		//logical mistake : you have to check it yourself
			
	}
}