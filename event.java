import java.util.Scanner;
public class event
{
     public static void main() 
     {
        Scanner sc = new Scanner(System.in);
        int teen=0;
        int adult =0;
        for(int i=0;i<10; i++)
        {
            System.out.println("please enter your age");
            int age= sc.nextInt();
            if(age>18)
            {
                adult=adult+1;
            }
            else if(age<1)
            {
                adult=adult+1;
                System.out.println("this is outside the possible value.the loop has ended");
                break;
            }
        }
        System.out.println("the number of entries over the age of 18 were "+adult);
    }
}
