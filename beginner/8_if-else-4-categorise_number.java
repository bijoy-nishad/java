import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		//categorise a number -
		//pos even, pos odd, neg even, neg odd 
		//10 -> Positive Even 
		//13 -> Positive Odd 
		//-12 -> Negative Even 
		//-15 -> Negative Odd 
		
		
		//int N = scn.nextInt();
		
		//way1
		/*
		if(N > 0 && N % 2 == 0) {
			System.out.println("Positive Even");
		}
		else if(N > 0 && N % 2 != 0) {
			System.out.println("Positive Odd");
		}
		else if(N < 0 && N % 2 == 0) {
			System.out.println("Negative Even");
		}
		else if(N < 0 && N % 2 != 0){
			System.out.println("Negative Odd");
		}
		*/
		
		
		
		//way2 - Nested
		/*
		if(N > 0) {
			if(N % 2 == 0) {
				System.out.println("Positive Even");
			}
			else {
				System.out.println("Positive Odd");
			}
		}
		else if(N < 0){
			if(N % 2 == 0) {
				System.out.println("Negative Even");
			}
			else {
				System.out.println("Negative Odd");
			}
		}
		*/	
		
		
	}
}