
import java.util.*;
import java.io.*;
public class CompPaper
{
  public static void main(String args[])
    {int  i,p1,p2,t,l=100,h=0,b;  
        String name;
        String Sname[]=new String[8];
        int marks1[]=new int[8];
        int marks2[]=new int[8];
        int total[]=new int[8];
        Scanner S=new Scanner (System.in);
        for(i=0;i<8;i++)
        {System.out.println("Enter student name");
            name=S.next();
            Sname[i]=name;
         System.out.println("Enter student marks paper 1 ");
         p1=S.nextInt();
         marks1[i]=S.nextInt();
         System.out.println("Enter student marks paper 2 ");
         p2=S.nextInt();
         marks2[i]=S.nextInt();
         t=p1+p2;
         total[i]=t;
         if(t>h){h=total[i];}
         if(t<l){l=total[i];}
        }
        for(b=0;b<8;b++)
        {System.out.println(Sname[b]+" : "+total[b]);}
        System.out.println("Students who got 75 and above are : ");
            for(b=0;b<8;b++)
            {if(total[b]>=75){System.out.println(Sname[b]);}}
            System.out.println("********************************************************************** ");
            for(b=0;b<8;b++)
            {if(total[b]==h){System.out.println(Sname[b]+" : "+ total[b]+" is the highest ");}}
            for(b=0;b<8;b++)
            {if(total[b]==l){System.out.println(Sname[b]+" : "+ total[b]+" is the lowest ");}}
        }
}

