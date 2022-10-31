import java.util.*;
import java.io.*;
public class numnum
{
   public static void main(String args[])
    {int i,num,small=100,large=0,t=0,avg,b;
        int PosNum[]=new int[25];
        Scanner S=new Scanner (System.in);
        for(i=0;i<25;i++)
        {System.out.println("Enter number");
        num=S.nextInt();
        while(num<=0||num>100){System.out.println("ERROR re-enter number");
        num=S.nextInt();}
        PosNum[i]=num;
        if(num<small){small=num;}
        if(num<large){large=num;}
        t=t+num;
    }
    avg=t/25;
    System.out.println("Largest number : "+large);
    System.out.println("Smallest number : "+small);
    System.out.println("Average : "+avg);   
    for(b=0;b<25;b++){System.out.println("Number "+i+" : "+PosNum[b]);}
}
}
