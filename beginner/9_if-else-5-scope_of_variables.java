class Main {
	public static void main(String args[]) {
		
		// int a = 10;
		// {
		// 	a++; 
		// 	a = a * 3; 
		// }
		// System.out.println(a);
		
		
		// int a = 10;
		// {
		// 	int b = 20;
		// }
		// System.out.println(b);
		
		
		/*
		int x = 10, y = 20;
		{
			System.out.println(x + " " + y); //10 20
		}
		
    	{
			x = 15;
			System.out.println(x + " " + y); //15 20
    	}
    	System.out.println(x + " " + y); //15 20
		*/
		
		
		
		/*
		int x = 10, y = 20;
		{
			System.out.println(x + " " + y);
		}
		
    	{
			int x = 15; //error (x is already defined)
			System.out.println(x + " " + y); 
    	}
    	System.out.println(x + " " + y); 
		*/
		
		
		/*
		int x = 10;
    	{	
			int y = 20;
			System.out.println(x + " " + y); 
    	}
		
    	{
        	System.out.println(x + " " + y); //error (can't find symbol y)
    	}
    	System.out.println(x + " " + y); //error (can't find symbol y)
		*/
		
		
		
		
		//maximum of two numbers 
		/*
		int a = 20;
		int b = 15;
		int max = 0;
		
		if(a > b) {
			max = a;
		}
		else {
			max = b;
		}
		
		System.out.println(max);
		*/
		
		
        
        
		/*
		int a = 2;
		int b = 3;
		
		if(true) {
			int c = a * b;
		}
		
		System.out.println(c); //error
		*/
		
		
		//corrections in above code 
		/*
		int a = 2;
		int b = 3;
		int c = 0;
		
		if(true) {
			c = a * b;
		}
		
		System.out.println(c);
		*/
		
			
		/*
		int a = 2;
		int b = 3;
		
		if(true) {
			int c = a * b;
			System.out.println(c); 
		}
		*/
		
	}
}