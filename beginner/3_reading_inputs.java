import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		
		/*
		int num = 10; //creation of int variable
		num = 50; //changing the value of num to 50
		System.out.println(num);
		*/
		
		
		
		//Rules for naming your variables
		/*
		  1) variable name can't start with a digit
		  2) Special char allowed : $ and _
		  3) Variable naming also follows case sensitive
		  4) don't use reserved keywords as the variable name
		    (int, float, double, static, void, class, public)
		*/
		
		
		// black_grapes_ (valid)
		// sun$shine (valid)
		// 7a (invalid)
		// _roll_number$ (valid)
		// 4twenty (invalid)
		// #age (invalid)
		// spring roll (invalid)
		// _delhi (valid)
		// roll_number (valid)
		// bus ticket (invalid)
		// static (invalid)
		// void (invalid)
		// $$$$ (valid)
		
		
		/*
		int num = 2000000000;  
		System.out.println(num);
		//-2 * (10 power 9) to 2 * (10 power 9) [Limit for int]
		*/
		
		/*
		long num = 200000000000000000000l; 
		System.out.println(num);
		//-(10 power 18) to (10 power 18) [Limit for long]
		*/
		
		
		//both int and long are used to store integer numbers
		//but long has more capacity it can store big numbers
		
		
		
		//both float and double are used to store decimal numbers 
		//but double has more capacity it has more precision
		/*
		float a = 10;
		float b = 3;
		float c = a / b;
		System.out.println(c);
		
		double a1 = 10;
		double b1 = 3;
		double c1 = a1 / b1;
		System.out.println(c1);
		*/
		
		
		/*
		double dv = 4.56;
		System.out.println(dv);
		
		
		float fv = 4.56f;
		System.out.println(fv);
		*/
		
		
		//long num = 2000000000000l;
		
		/*
			compiler favourites 
			integer number -> int 
			decimal number -> double 
		*/
		
		
		
		
		//boolean datatype variable can store only true or false
		/*
		boolean is_laptop_on = false;
		System.out.println(is_laptop_on);
		*/
		
		
		
		
		//typecasting
		// int a = 3000;
		// long b = a; 
		// System.out.println(b);
		
		
		// long a = 3000l;
		// int b = (int)a;
		// System.out.println(b);
		
		
		// long a = 3000000000000l;
		// int b = (int)a; //data loss
		// System.out.println(b);
		
		
		// double val = 4.5;
		// int num = (int)val;
		// System.out.println(num);
		
		
		/*
		long to int (big to small) -> not direct (but we can force the compiler)
		int to long (small to big) ->  can be done automatically
		*/
		
		
		 
		 
		//How to Read input from user
		
		Scanner scn = new Scanner(System.in); //scn is the variable name
		
		/*
		int a = scn.nextInt(); //a = 10
		int b = scn.nextInt(); //b = 20
		
		System.out.println(a);
		System.out.println(b);
		*/
		
		
		//Take weight, age and height of a person as input
		
		/*
		double wt = scn.nextDouble(); //wt = 56
		int age = scn.nextInt(); //age = 32
		double ht = scn.nextDouble(); //ht = 164
		
		System.out.println("Weight is = " + wt + " kg");
		System.out.println("Age is = " + age + " years");
		System.out.println("Height is = " + ht + " cm");
		*/
		
		
		/*
			int -> scn.nextInt();
			long -> scn.nextLong();
			double -> scn.nextDouble();
			float -> scn.nextFloat();
			boolean -> scn.nextBoolean();
		*/
		
		
	}
}