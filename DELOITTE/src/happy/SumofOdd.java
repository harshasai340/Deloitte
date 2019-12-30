package happy;
import java.util.Scanner;

public class SumofOdd {
	public static void main(String[] args) {
		int num;
		Scanner Sc =  new Scanner(System.in);
				num= Sc.nextInt();
	System.out.println(SumofOdd.sumOfOdds(num));	
	}
	public static int sumOfOdds(int num) {
		int sum = 0;
		while(num>0) {
			int r = num%10;
			if(r%2!=0)
				sum = sum + r;
			num = num /10;
		}
		return sum;
	}
}
