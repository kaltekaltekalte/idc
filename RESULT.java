
import java.util.*;
import java.io.*;
public class RESULT
{
  public static void main (String args[])
  {float maths,english,hindi,computer,science,average;
      Scanner S=new Scanner(System.in);
      System.out.println("Please enter marks achieved out of 100 in maths = ");
      maths=S.nextFloat();
      System.out.println("Please enter marks achieved out of 100 in english = ");
      english=S.nextFloat();
      System.out.println("Please enter marks achieved out of 100 in science = ");
      science=S.nextFloat();
      System.out.println("Please enter marks achieved out of 100 in hindi = ");
      hindi=S.nextFloat();
      System.out.println("Please enter marks achieved out of 100 in computer = ");
      computer=S.nextFloat();
      average=(maths+science+hindi+english+maths)/5;
      if (average>=80 )
      System.out.println("Grade:A");
       else if (average<80 && average>=60)
      System.out.println("Grade:B");
       else if(average<60 && average>=40)
      System.out.println("Grade:C");
      else if(average<=39)
      System.out.println("FAIL");
      
    }
}
  