package happy;
import java.util.Scanner;
public class Switch {
public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	float inr,usd;
	int choice;
	System.out.println("Enter your choice");
	System.out.println("1- INR->USD");
	System.out.println("2- USD->INR");
	choice = sc.nextInt();
	switch(choice) 
	{
	case 1:
		System.out.println("Enter currency (rs).");
	    inr = sc.nextInt();
	    usd = inr/71;
	    System.out.println(usd);
	   break;
	case 2:
	
		System.out.println("Enter currency (usd).");
	    usd = sc.nextInt();
	    inr = usd*71;
	    System.out.println(inr);
	    break;
	}	
	
}
}
