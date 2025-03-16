class Q1{
	public static void main(String args[])
	{
		int a=2;
		int b=5;
		int c=7;
		
		System.out.println("Post increment is "+(a++));
		System.out.println("Pre increment is "+(++a));
		System.out.println("Post decrement is "+(a--));
		System.out.println("Pre decrement is "+(--a));
		System.out.println("\n");
		
		
		
		boolean x=true;
		boolean y=false;
		
		System.out.println("x && y: "+(x && y));
		System.out.println("x || y: "+(x || y));
		System.out.println("!x: "+(!x));
		System.out.println("\n");
		
		System.out.println("a>b: "+(a>b));
		System.out.println("a<b: "+(a<b));
		System.out.println("a>=b: "+(a>=b));
		System.out.println("a<=b: "+(a<=b));
		System.out.println("a==b: "+(a==b));
		System.out.println("a!=b: "+(a!=b));
		System.out.println("\n");
		
		System.out.println("c +=3: "+(c +=3));
		System.out.println("c -=3: "+(c -=3));
		System.out.println("c *=3: "+(c *=3));
		System.out.println("c /=3: "+(c /=3));
		System.out.println("c %=3: "+(c %=3));
		System.out.println("c &=3: "+(c &=3));
		System.out.println("c |=3: "+(c |=3));
		System.out.println("c ^=3: "+(c ^=3));
		System.out.println("c <<=3: "+(c <<=3));
		System.out.println("c >>=3: "+(c >>=3));
		System.out.println("c >>>=3: "+(c >>>=3));
		System.out.println("\n");
		
		
		
		
		int result;
		result=((a<b)? a:b);
		System.out.println("Min of two numbers: "+ result);
		
	   }	
	}
		
	