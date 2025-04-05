import java.util.Scanner;
class Ex02{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);  
		char Control=' ';
		int sum=0;
		do{
	
            System.out.print("Enter the number to find summation:");
            int a=sc.nextInt();
		    sum=sum+a;
		    System.out.print("Do you want to continue(Y/N):");
		    Control=sc.next().charAt(0);
		}while(Control=='Y');
		
		
		
		System.out.print("Summation of numbers:"+sum);
		
	}
}
		  
		
		