package happy;
import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		int n,f = 1 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n = sc.nextInt();
		while(n>0) {
			f*=n;
		    n--;
	}
         System.out.println("factorial " +  f);
}
}
