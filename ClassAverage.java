import java.util.*;
import java.io.*;
public class ClassAverage
{public static void main(String args[])
    {int i,student;
     double marks,average,total=0;
     System.out.println("Enter Number of students");
     Scanner S=new Scanner(System.in);    
     student=S.nextInt();
        for(i=0;i<student;i++)
        {System.out.println("Enter marks between 0 and 100 for student  "+student);
            marks=S.nextDouble();
            if (marks> 100 || marks<0)
            {
            System.out.println("ERROR");
         }
            total=total+marks;
        }
        average=total/student;
    }
    
}
