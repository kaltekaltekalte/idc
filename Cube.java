
import java.util.*;
import java.io.*;
public class Cube
{public static void main(String args[])
    {int num,cube=1,i;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number");
        num=S.nextInt();
        for(i=0;i<3;i++)
        {cube=cube*num;}
        System.out.println("Cube is "+cube);
    }
}
