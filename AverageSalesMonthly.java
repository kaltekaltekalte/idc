import java.util.*;
import java.io.*;
public class AverageSalesMonthly
{
   public static void main(String args[])
   {int i,month,saleA,sale,t=0;
       Scanner S=new Scanner(System.in);
       System.out.println("Enter days in the month");
       month=S.nextInt();
       int saleD[]=new int[month];
       for(i=0;i<month;i++)
       {System.out.println("Enter sales");
        sale=S.nextInt();
         saleD[i]=sale;
         t=t+sale;
        }
        System.out.println("Total monthly sale: Rs."+t);
        saleA=t/month;
        System.out.println("Average Monthly sales: Rs."+saleA);
        for(i=0;i<month;i++)
        {System.out.println("Day "+i+" : Rs."+saleD[i]);
        }
    }
}
