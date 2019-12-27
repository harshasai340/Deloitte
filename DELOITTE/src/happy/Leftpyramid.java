package happy;

import java.util.Scanner;

public class Leftpyramid {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n=0;
		System.out.println("enter a number");
		n=in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((i+j+1)%2+" ");
			}
			System.out.println();
		}
	}

}
