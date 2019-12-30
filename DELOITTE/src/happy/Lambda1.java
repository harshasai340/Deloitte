package happy;

interface Operation{
	double operate(double a,double b);
}
class Calculation{
	double calculate(double i,double j,Operation op) {
		return op.operate(i, j);
	}
}
public class Lambda1 {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		double a=5,b=3;
		double sum = cal.calculate(a,b,(x,y)->(x+y));
		double mul = cal.calculate(a, b, (x,y)->(x*y));
		double div = cal.calculate(a, b, (x,y)->(x/y));
		double mod = cal.calculate(a, b, (x,y)->(x%y));
		double sub = cal.calculate(a, b, (x,y)->(x-y));
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mod);
	}

}
