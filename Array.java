
import java.util.*;
import java.io.*;
public class Array
{public static void main(String args[])
    {int i,a;
        String name[]=new String[5];
        Scanner S=new Scanner(System.in);    
        int marks[]=new int[5];
        for(i=0;i<5;i++)
        {System.out.println("Enter name");
            name[i]=S.next();
          System.out.println("Enter marks"); 
          marks[i]=S.nextInt();
        }
        for(a=0;a<5;a++)
        {System.out.println(name[a]+" scored "+marks[a]);}
    }
}
