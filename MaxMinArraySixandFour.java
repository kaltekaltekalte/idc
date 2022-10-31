
import java.util.*;
import java.io.*;
public class MaxMinArraySixandFour
  {public static void main(String args[])
    {int i,a,num,max,min;
    int entry[][]=new int[6][4];
    Scanner s=new Scanner(System.in);
    for(i=0;i<6;i++)
    {for(a=0;a<4;i++)
        {System.out.println("Enter number");
            num=s.nextInt();
          entry[i][a]=num;
        }
    }
    max=entry[0][0];
    min=entry[0][0];
    for(i=0;i<6;i++)
    {for(a=0;a<4;i++)
        {if (entry[i][a]>max){max=entry[i][a];}
        if (entry[i][a]<min){min=entry[i][a];}
        }
    }
    System.out.println("Maximum number : "+max);
    System.out.println("Minimum number : "+min);
   }
}