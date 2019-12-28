package happy;
import java.util.*;
public class EmailTable {
	
	
public static void main(String[] args) {
	String[] emails = {"axc@yahoo.com","abc@hotmail.com","zzbc@gmail.com","abcgfg@yahoo.com",
			"axcc@yahoo.com","abddc@gmail.com","abc@hotmail.com","abc@aol.com","abc@protonmail.com","abc@hotmail.com",
			"abc@yahoo.com","abc@hotmail.com","abc@aol.com","abc@gmail.com","abc@hotmail.com","abc@rediffmail.com",
			"abc@deloitte.com","abc@others.com","abc@yahoo.com","abc@gmail.com"};
	
	
	ArrayList <String> gmail = new ArrayList<String>();
	ArrayList <String> yahoo = new ArrayList<String>();
	ArrayList <String> hotmail = new ArrayList<String>();
	ArrayList <String> others = new ArrayList<String>();

	int len = emails.length;
for(int i=0;i<len;i++) {
	if(emails[i].contains("gmail")) {
		gmail.add(emails[i]);
	}
	else if(emails[i].contains("yahoo")) {
		yahoo.add(emails[i]);
	}
	else if(emails[i].contains("hotmail")) {
		hotmail.add(emails[i]);
	}
	else 
		others.add(emails[i]);
}

System.out.println("Gmail\t\t\tYahoo\t\t\tHotmail\t\t\tOthers");
Iterator<String> gmailItr = gmail.iterator();
Iterator<String> yahooItr = yahoo.iterator();
Iterator<String> hotmailItr = hotmail.iterator();
Iterator<String> othersItr = others.iterator();
int count=1;
while(count<6) {
	
	char ch = 'g';
	if(ch=='g') {
		if(gmailItr.hasNext())
		System.out.print(gmailItr.next()+"\t\t");
		else 
			System.out.print("\t\t\t");
		ch='y';
	}
	if(ch=='y') {
		if(yahooItr.hasNext())
		System.out.print(yahooItr.next()+"\t\t");
		else 
			System.out.print("\t\t\t");
		ch='h';
	}
	if(ch=='h') {
		if(hotmailItr.hasNext())
		System.out.print(hotmailItr.next()+"\t\t");
		else 
			System.out.print("\t\t\t");
		ch='o';
	}
	if(ch=='o') {
		if(yahooItr.hasNext())
		System.out.print(othersItr.next()+"\t\t");
		else 
			System.out.print("\t\t\t");
		//ch='g';
	}
	System.out.println();
	count++;
}
}
}