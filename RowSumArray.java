
import java.util.*;
import java.io.*;
public class RowSumArray
{public static void main(String args[])
    {int i,a,num,sum=0;
    int entry[][]=new int[3][3];
    int Rsum[]=new int[3];
    Scanner s=new Scanner(System.in);
    for(i=0;i<3;i++)
    {for(a=0;a<3;i++)
        {System.out.println("Enter number");
            num=s.nextInt();
          entry[i][a]=num;
          sum=sum+num;
        }
        Rsum[i]=sum;
    }
   for(i=0;i<3;i++)
    {
        System.out.println(Rsum[i]);
         
    }
}
}