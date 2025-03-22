import java.util.Scanner;
class Ex04{
	public static void main(String args[])
	{
		
			
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your First Name:");
		String fname=sc.nextLine();
		
		System.out.print("Enter your Last Name:");
		String lname=sc.next();
		
		System.out.print("Enter your Marks:");
		int marks=sc.nextInt();
		
		System.out.print("Enter your Reg no:");
		String regno=sc.next();

		System.out.print("Enter your Age:");
		int age=sc.nextInt();
		
		System.out.print("Enter your Sex(F/M):");
		char sex=sc.next().charAt(0);
		
		System.out.print("Enter your Phone no:");
		long phoneno=sc.nextLong();
		
		System.out.print("Enter your GPA:");
		double gpa=sc.nextDouble();

		
		
		
		System.out.println("Fullname:"+fname+" "+lname+"\n"+"Marks is:"+marks+"\n"+"Reg No:"+regno+"\n"+"Age is:"+age+"\n"+"Sex:"+sex+"\n"+"Phone no is:"+phoneno+"\n"
		+"GPA:"+gpa);
	}
}
	

		