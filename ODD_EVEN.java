import java.util.Scanner;
public class ODD_EVEN
{
     public static void main() 
     {
      Scanner sc = new Scanner(System.in);
      int odd=0;
      int even = 0;
      for(int i=1;i<5;i++)
      {
          System.out.println("please enter the value of the "+i+"st number");
          int number= sc.nextInt();
          if(number%2==0)
          {
              odd=odd+1;
            }
            else
            {
                even=even+1;
            }
      }
      System.out.println("there are "+odd+" numbers.and there are "+even+" even numbers");
    }
}