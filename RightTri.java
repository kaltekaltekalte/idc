

import java.util.*;
import java.io.*;
public class RightTri
{public static void main(String args[])
    {int i=0,a=0,row;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter number of rows");
        row=S.nextInt();
        for(i=0;i<row;i++)    
        { System.out.println("");
            for (a=0;a<=i;a++)
            System.out.print(a+1);
        }
    }
}
