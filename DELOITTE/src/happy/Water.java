package happy;

import java.util.Scanner;

public class Water {
	public static void main(String[] args)  {
		int a=0,b=0,c;
		System.out.println("enter 2 numbes");
		Scanner sc =  new Scanner(System.in);
		try
		{
			a= sc.nextInt();
		    b= sc.nextInt();
		    c= a+b;
			System.out.println("sum is " +c);
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Input mismatch occured");
		}
		
	}

}
