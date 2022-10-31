
import java.util.*;
import java.io.*;
public class MathsQuiz
{public static void main(String args[])
    {int num,i,ans,a,c=0;
        Scanner S=new Scanner(System.in);
        System.out.println("Please enter the number for which you want the quiz");
        num=S.nextInt();
        for(i=1;i<=10;i++)
        { System.out.println(num+"*"+i+"=");
            ans=S.nextInt();
            for(a=0;a<2;a++)
            {if (ans==num*i)
                {c++;
                 a=2;//to end the loop
                }        
                else 
                {System.out.println("Wrong! Try again:");
                    System.out.println(num+"*"+i+"=");
                 ans=S.nextInt();
                }
            }
        }
        System.out.println("Correct answers: "+c );
    }
}
