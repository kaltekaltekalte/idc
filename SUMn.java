

import java.io.*;
import java.util.*;
public class SUMn
{
  public static void main(String[]args)
  { int  sum=0;int n;
      Scanner S=new Scanner(System.in);
      System.out.println("Enter natural number");
      n=S.nextInt();
      for (int i=1;i<=n;i++)
      {sum = sum+i;        }
        System.out.println("The sum "+n+ " natural number is : " + sum + ".");
         
    } 
}