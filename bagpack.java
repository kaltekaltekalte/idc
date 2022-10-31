import java.util.Scanner;
public class bagpack
{
  public static void main() 
  {
        Scanner sc = new Scanner(System.in);
        int total_weight=0;
    while(true)
    {
        System.out.println("please enter the total weight capacity of your bagpack in  kilograms");
        int capacity= sc.nextInt();
        System.out.println("please enter the total number of items in your bagpack");
        int items= sc.nextInt();
        total_weight=0;
        for(int i=1;i<items+1; i++)
        {
            
            System.out.println("please enter the weight of item: "+i);
            int weight= sc.nextInt();
            
            if(total_weight+weight<capacity)
            {
                total_weight=total_weight+weight;
              System.out.println("the total weight of your bagpack is  "+total_weight);
            }
            else if(total_weight+weight==capacity)
            {
                total_weight=total_weight+weight;
             System.out.println("the total weight of your bagpack is  "+total_weight);
             break;
            }
            else
            {
                System.out.println("this is more than the total capacity of your bagpack.The program will restart");
                i=i-i;
               
            }
        }
    }
  }
}
