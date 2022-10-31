
import java.util.*;
import java.io.*;
public class EmployeeEarnings
{
    public static void main(String args[])
   {int i,salary,a=0;
       String name;
       Scanner S=new Scanner(System.in);
       String nameA[]=new String[100];
       int employee[]=new int[100];
       for(i=0;i<100;i++)
       { System.out.println("Enter name of the employee");
           name=S.next();
           nameA[i]=name;
           System.out.println("Enter salary for"+nameA[i]);
        salary=S.nextInt();
         employee[i]=salary;
         if (employee[i]>=1000000){a++;}
        }
        System.out.println(a+" number of employees got more than Rs.10 lakhs");
        for (i=0;i<100;i++)
        {if (employee[i]>=2500000){System.out.println(nameA[i]+" recieves : Rs."+employee[i]);}}
                }
    }

