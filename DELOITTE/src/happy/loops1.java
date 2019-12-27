package happy;
import java.util.Scanner;

public class loops1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number :");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
               System.out.print(j+" ");
		System.out.println("");
		}
	}

}
