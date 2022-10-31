
import java.util.*;
import java.io.*;
public class Weight
{public static void main(String args[])
    {int weight,i,reject=0;
       Scanner S=new Scanner(System.in);
       for(i=0;i<1000;i++)
       {System.out.println("Enter the weight for item"+i);
           weight=S.nextInt();
           if(weight > 25||weight<5)
           reject++;
    }
    System.out.println("Rejected percentage:"+(reject/10));
}