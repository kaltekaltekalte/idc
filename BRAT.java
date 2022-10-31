import java.util.*;
import java.io.*;
public class BRAT
{public static void main(String args[])
    {int i=0,a=0,row;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter number of rows");
        row=S.nextInt();
        System.out.print(1);
        for(i=0;i<=row;i++)    
        { System.out.println("");
            if (i%2 == 0)
            for (a=0;a<=i;a++){
            System.out.print(0);
            System.out.print(1);}
            else {for (a=0;a<=i;a++){
            System.out.print(1);
            System.out.print(0);}}
            
        }
    }
}
