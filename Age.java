
import java.util.*;
import java.io.*;
public class Age
{public static void main(String args[])
    {int people,i,age,over18=0;
       Scanner S=new Scanner(System.in);
       System.out.println("Enter number of people");
        people=S.nextInt();
       for(i=0;i<people;i++)
       {System.out.println("Enter the age");
           age=S.nextInt();
           if(age > 18)
           {over18++;}
           if(age<0)
           i=i+people;
           
        }
        System.out.println("People over 18  = "+over18);
      
    }
}