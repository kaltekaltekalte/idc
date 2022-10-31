import java.util.*;
import java.io.*;
public class Average
{public static void main(String args[])
{int age,average;
     String name;
     System.out.println("Enter name of student");
     Scanner S=new Scanner(System.in);    
     name=S.next();
    System.out.println("Enter  age of student");   
     age=S.nextInt();
     System.out.println("Enter average of student");   
     average=S.nextInt();
     System.out.println("Name:"+name);
     System.out.println("Age :"+age);
     System.out.println("Average :"+average);
    }}
