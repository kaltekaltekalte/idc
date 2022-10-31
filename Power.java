import java.util.*;
import java.io.*;
public class Power
{public static void main(String args[])
    {int num1,num2,ans;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number");
        num1=S.nextInt();
        System.out.println("Enter the power");
        num2=S.nextInt();
        ans=(num1^num2);
        System.out.println("Answer: "+ans);
    }
}
