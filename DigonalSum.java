
import java.util.*;
import java.io.*;
public class DigonalSum
{public static void main(String args[])
    {int i,a,num,sum;
    int entry[][]=new int[4][4];
    Scanner s=new Scanner(System.in);
    for(i=0;i<4;i++)
    {for(a=0;a<4;i++)
        {System.out.println("Enter number");
            num=s.nextInt();
          entry[i][a]=num;
        }
    }
    sum=entry[0][0]+entry[1][1]+entry[2][2]+entry[3][3];
    System.out.println("The sum is : "+sum);
}
}
