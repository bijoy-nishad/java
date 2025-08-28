class Main {
	public static void main(String args[]) {
		// Your code goes here
		
		//System.out.println("Hello" + "10");
		
		/*
			+ has two behaviours
			1) when both operands are numbers, + is doing mathematical addition
			2) when even one of the operand is a text msg, + is doing concatenation (append)
		*/
		
		
        
		/*
		System.out.println("198" + 2);
		// "198" + 2 -> "1982" (concatenation)
		
		System.out.println(198 + 2);
		//198 + 2 -> 200 (addition)
		*/
		
		
		
		//System.out.println("198" + 6 + 2);
		/*
		  "198" + 6 -> "1986"
		  "1986" + 2 -> "19862"
		*/
		
		
		
		//System.out.println("1983" + 5 + 2 + 86);
		/*
		  "1983" + 5 -> "19835"
		  "19835" + 2 -> "198352"
		  "198352" + 86 -> "19835286"
		*/
		
		
		
		//System.out.print(6 + 2 + "198");
		/*
		   6 + 2 -> 8
		   8 + "198" -> "8198"
		*/
		
		
		
		//System.out.print(6 + 2 + "156" + 7 + 5);
		/*
		  6 + 2 -> 8
		  8 + "156" -> "8156"
		  "8156" + 7 -> "81567"
		  "81567" + 5 -> "815675"
		*/
		
		
		
		//quizzes
		
		//System.out.print("156" + 7 + 1);
		//"156" + 7 -> "1567" + 1 -> "15671"
		
		
		//System.out.print( 7 + 1 + "156");
		//7 + 1 -> 8 + "156" -> "8156"
		
		
		//System.out.println(9 + 3 + "156" + 7 + 1);
		/*
		  9 + 3 -> 12
		  12 + "156" -> "12156"
		  "12156" + 7 -> "121567"
		  "121567" + 1 -> "1215671"
		*/





		//System.out.println(5 + 2 * 3);
		//5 + 6 -> 11
		//BODMAS -> Brackets, Orders(power or root), Div, Mult, Add, Sub
		
		
		
		//System.out.println((5 + 2) * 3);
		//7 * 3 -> 21
		
		
		//System.out.println("156" + (7 + 5));
		/*
		  "156" + 12 -> "15612"
		*/
		
		
		
		//System.out.println("156" + 2 * 3);
		//"156" + 6 -> "1566"
		
		
		//System.out.println(3 - 2 + "156" + 4 - 1);
		/*
			3 - 2 -> 1
			1 + "156" -> "1156"
			"1156" + 4 -> "11564"
			"11564" - 1 -> error
		*/
		
		
		
		//System.out.println(3 - 2 + "156" + (4 - 1));
		/*
		   3 - 2 -> 1
		   1 + "156" -> "1156"
		   "1156" + (4 - 1) -> "1156" + 3 -> "11563"
		*/
		
		
		
		//System.out.println(3 - 2 + "156" + 2 * 4);
		/*
		  3 - 2 -> 1
		  1 + "156" -> "1156"
		  "1156" + 8 -> "11568"
		*/
		
		
		
		//System.out.println(3 - 2 + "156" + (2 - 4));
		/*
		  3 - 2  -> 1
		  1 + "156" -> "1156"
		  "1156" + (2 - 4) -> "1156" + -2 -> "1156-2"
		*/
		
		
		
		//Sum of two integer variables
		
		// int a = 20;
		// int b = 18;
		
		//System.out.println("Sum of " + a + " and " + b + " is = " + (a + b)); 
		/*
			a = 20, b = 18
			
			"Sum of " + 20 -> "Sum of 20"
			"Sum of 20" + " and " -> "Sum of 20 and "
			"Sum of 20 and " + 18 -> "Sum of 20 and 18"
			"Sum of 20 and 18" + " is = " -> "Sum of 20 and 18 is = "
			"Sum of 20 and 18 is = " + 38 -> "Sum of 20 and 18 is = 38"
		*/
		
		
	    //System.out.println("Mult of " + a + " and " + b + " is = " + (a * b)); 
        
		
		
		//int used to store integer numbers
		/*
		int a = 10;
		System.out.println(a);
		*/
		
		
		//float, double both are used to store decimal numbers
		//double is more precise than float 
		/*
		float a = 10;
		float b = 3;
		float c = a / b;
		System.out.println(c);
		
		
		double d = 10;
		double e = 3;
		double f = d / e;
		System.out.println(f);
		*/
	}
}