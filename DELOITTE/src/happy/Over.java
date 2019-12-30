package happy;
import java.util.Scanner;

class Adders
{
	int add(int a, int b) {
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	int add(int a ,int b,int c)
	{
		return a+b+c;
	}
}

public class Over {
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	int a = Sc.nextInt();
	int b = Sc.nextInt();
	//int c = Sc.nextInt();
	Adders obj = new Adders();
	System.out.println(obj.add((float)a,(float)b));
}
}

