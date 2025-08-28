import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		
		Scanner scn = new Scanner(System.in);
		
		//Ques2 - Given old salary and rating, find new salary
		/*
		int os = scn.nextInt();
		int rating = scn.nextInt();
		
		
		if(rating <= 2) {
			//hike is 0%
			System.out.println(os);
		}
		else if(rating == 3) {
			//hike is 5%
			System.out.println(os + 0.05*os);
		}
		else if(rating == 4) {
			//hike is 10%
			System.out.println(os + 0.1*os);
		}
		else if(rating == 5) {
			//hike is 15%
			System.out.println(os + 0.15*os);
		}
		*/
		
		
		
		//Ques 3 - Categorise triangle into Equilateral, Isoceles and Scalene
		/*
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		if(a == b && b == c) {
			System.out.println("Equilateral");
		}
		else if(a == b || b == c || c == a) {
			System.out.println("Isoceles");
		}
		else {
			System.out.println("Scalene");
		}
		*/
		
		
		
		//quizzes
		/*
		int N = 5; 
		if(N > 2) 
			System.out.println("Yayay"); 
			System.out.println("Hmmmm"); //this line is coming in between if and else (Error)
		else 
			System.out.println("Blahblah!!");
		*/
		
		
		/*
		int N = 5; 
		if(N > 10) 
			System.out.println("Yayay"); 
		else 
			System.out.println("Blahblah!!");
			System.out.println("Hmmmm");
		*/
		
		
		
		
		
		//Doubts
		/*
		int a=5, b=6;  //a = 6, b = 5
		if(a++ == --b) {  //5 == 5
			System.out.println("5=5"); 
		} 
		else { 
			System.out.println("NONE"); 
		}
		*/
		
		//a++, use a and then inc it by 1
		//--b, dec b by 1 and then use it
		
		
		/*
		boolean x,y,z;
		x = y = z = true;
		
		if(!x || (!y && !z)) {
			System.out.println("WHY");
		}
		else {
			System.out.println("WHAT");
		}
		
		// !x || (!y && !z)
		
		// !true || (!true && !true)
		
		// false || (false && false) -> false
		*/
		
	}
}