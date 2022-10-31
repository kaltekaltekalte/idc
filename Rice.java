import java.util.*;
import java.io.*;
public class Rice
{public static void main(String args[])
    {int i,accepted=0,rejected=0;
        double weight;
        Scanner S=new Scanner(System.in);
        for(i=0;i<10;i++)
            {System.out.println("Enter the weight");
             weight=S.nextDouble();
            if (weight>50.5 ||weight < 49.5) 
            rejected++;
            else accepted++;
        }
          System.out.println("Rejected "+rejected);   
        System.out.println("Accepted "+accepted);
    }
}
