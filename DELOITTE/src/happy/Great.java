package happy;

import java.util.Scanner;
 class Great{
public static void main(String []args)
{
         int a,b,c;
         System.out.println("enter numbers");
          Scanner sc = new Scanner(System.in);
             a = sc.nextInt();
               b = sc.nextInt(); 
                c = sc.nextInt();

  if(a>b)
        {
          if(a>c)
         System.out.println(a+" is big");
          else
           System.out.println(c+"is big");       
        }
        else 
       {
       if(b>c)
       System.out.println(b+"is big");
      else
       System.out.println(c+"is big");

       }
   }
}
