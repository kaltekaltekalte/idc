import java.util.Scanner;
public class weight
{
     public static void main() 
     {
       Scanner sc = new Scanner(System.in);
       double rejected =0;
       for(int i=1;i<1001; i++)
       {
           System.out.println("please input the weight of the "+i+" object");
           int weight= sc.nextInt();
           if(weight<5)
           {
            rejected=rejected+1;
           }
           else if(weight>25)
           {
            rejected=rejected+1;
           }
       }
       double percentage = rejected/1000*100;
       System.out.println("the percentage of rejected items is "+percentage+"%");
    }
}
