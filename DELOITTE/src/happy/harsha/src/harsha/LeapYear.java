package harsha;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class LeapYear {
	 public static void main(String[] args) {
		 List<Integer>years = Arrays.asList(2020,1996,2016,2003,2006,2026,2000,2030,2004,2008,2048);
		 years.stream().filter(s->(s%4==0) && (s%100!=0) ||(s%400==0)).forEach(s->System.out.println(s));
}
}