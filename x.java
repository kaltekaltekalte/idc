import java.util.Scanner;
public class x
{
     public static void main() 
     {
      Scanner sc = new Scanner(System.in);
      int[] array = new int[5];
      int i =0;
      for(i = 0;i<=5 ;i++)
      {
          array[i] = sc.nextInt();
      }
      
      for(int n = 0;n<=5 ;i++)
      {
          System.out.println(array[i]);
      }
      
    }
}