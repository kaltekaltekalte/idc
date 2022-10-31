import java.util.*;
import java.io.*;

public class BRAT2
{public static void main(String args[])
    { int row,i=0,a=0;
        Scanner S=new Scanner(System.in);
        System.out.println("Mata please yaar,enter the number of rows");
        row=S.nextInt();
        for(i=0;i<row;i++)
        {System.out.println("");
            if (row%2==0)
            {
                for(a=0;a<i;a++)
            {  if(a%2==0)
                System.out.print("0");
               else
                System.out.print("1");
            }}
        }
            
        else {
                for(a=0;a<i;a++)
            {  if(a%2==0)
                System.out.print("0");
               else
                System.out.print("1");
            }
            }
        }
}
}