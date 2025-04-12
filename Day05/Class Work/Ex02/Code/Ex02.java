import java.util.Scanner;
public class Ex02{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int Numbers[]=new int[10];
		
		System.out.print("Enter the element:");
		for(int i=0;i<10;i++){
		
		Numbers[i]=sc.nextInt();
		}
		
		
	String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(String day:days){
            System.out.println(day);
	    }	   
	}
}