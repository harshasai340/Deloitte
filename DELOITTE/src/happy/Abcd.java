package happy;
import java.lang.String;
public class Abcd {
	public static void main(String[] args) {
		String[] email= { "1@gmail.com","2@yahoo.com","3@yahoo.com","5@hotmail.com","4@hfbhs.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com","2@yahoo.com"};
		
		for(int i=0;i<email.length;i++)
		
		if(email[i].contains("@gmail.com"))
			   System.out.printf(email[i]);
		else if(email[i].contains("yahoo.com"))
		       System.out.printf(email[i]);
		else if(email[i].contains("hotmai.com"))
			   System.out.printf(email[i]);
	    else 
               System.out.printf(email[i]);
				     
     }
}
