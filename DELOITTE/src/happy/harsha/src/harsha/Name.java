package harsha;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Name {
 public static void main(String[] args) {
	 List<String>names = Arrays.asList("ajay","vijay","bablu","samantha");
	 names.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
     List<Integer>even = Arrays.asList(1,2,3,4,5,6,7,8,9,12,15,20,25,69,100);
     even.stream().filter(i->(i%2==0)).map(i->i*i).forEach(i->System.out.println(i));
 
 }
}
