
package harsha;
import java.io.*;
import java.util.*;
public class Exceptionhandling {
public static void main(String[] args) {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int a,b;
	System.out.println("enter values a and b");
	
try {
	a=Integer.parseInt(in.readLine());
	b=Integer.parseInt(in.readLine());
	
	double x =(double)a/b;
	System.out.println(x);
}
catch (ArithmeticException | NumberFormatException | IOException ex) {
System.out.println("error occured");
}
	System.out.println("result");
}
}

