
import java.util.Scanner;
public class computer_marks
{
     public static void main() 
     {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the number of students in the computer class");
    int students= sc.nextInt();
    int total = 0;
    int average = 0;
    for(int i=0;i<students; i++)
    {
        System.out.println("Please enter the marks of a student in computer between 0 and 100");
        int marks= sc.nextInt();

    
        if(marks>=0&&marks<=100)
        {
        total = total+marks;
        }
        else
        {
            System.out.println("ERROR: Please enter a value between 0 and 100");
        }
        average = total/students;
    }
    System.out.println("the average of the class is: "+ average);
}
}
