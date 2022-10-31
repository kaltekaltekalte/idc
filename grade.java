import java.util.Scanner;
public class grade
{
     public static void main() 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of subjects you have");
        double number= sc.nextDouble();
        double total=0;
        for(int i =1;i<number+1;i++)
      {
        
        System.out.println("please enter the marks of the "+i+"st subject");
        double total1= sc.nextDouble();
        total=total+total1;
      }
        
        double average = total/number;
        System.out.println("your average = "+average);
        if(average>=80)
        {
           System.out.println("distinction"); 
        }
        if(average<40)
        {
           System.out.println("fail"); 
        }
        else
        {
          System.out.println("pass");
        }
    }
}
//you would have to put another else if stating the if average was more that, equal to 60 and average is less that 80, print merit.
