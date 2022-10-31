import java.util.Scanner;
public class print
{
     public static void main() 
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the sentence or word you want to print");
      String sentence =sc.nextLine();
      System.out.println("Please enter the the numbe of times you want to print the sentence.");
      int number = sc.nextInt();
      for(int i=0;i<number;i++)
      {
          System.out.println(sentence);
      }
      
    }
}