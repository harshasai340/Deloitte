package happy;
import java.util.Scanner;
public class Tables {
	    public static void main(String args[])
	    {
	        int num, i, tab;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter a Number : ");
	        num = scan.nextInt();
			
	        System.out.print("Table of " + num + " is\n");
	        for(i=1; i<=20; i++)
	        {
	            tab = num*i;
	            System.out.print(num + " * " + i + " = " + tab + "\n");
	        }
	    }
	}


