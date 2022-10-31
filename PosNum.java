import java.util.*;
import java.io.*;
public class PosNum
{public static void main(String args[])
    {int i,a=-1,b=-1,num;
        Scanner S=new Scanner(System.in);
        int PosNum[]=new int[a];
        int NegNum[]=new int[b];
        for(i=0;i<5;i++){
        System.out.println("Enter number");
        num=S.nextInt();
        if(num>0)
        {a++;
        PosNum[a]=num;}
        if(num<0)
        {b++;
        NegNum[a]=num;}
    }
    }
}
