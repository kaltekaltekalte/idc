
import java.util.*;
import java.io.*;
public class Factorial
{public static void main(String args[])
    {int num,factorial=1,i,product;
        Scanner S=new Scanner(System.in);
        System.out.println("Please enter the number for which you want the factorial");
        num=S.nextInt();
        for(i=0;i<num;i++)
        {product=(num-i);
            factorial=factorial*product;
        }
        System.out.println("Factorial of"+ num+" is = "+ factorial);
    
    }
}
