
import java.util.*;
import java.io.*;
public class twodarray
{
   public static void main(String args[])
   {int row,column,mark;
       Scanner S=new Scanner(System.in);
       int marks[][]=new int[2][3];
       for(row=0;row<2;row++)
       {for (column=0;column<3;column++)
           {System.out.println("Enter the marks");
               mark=S.nextInt();
               marks[row][column]=mark;
            }
        }
        for(row=0;row<2;row++)
       {for (column=0;column<3;column++)
           {System.out.print(marks[row][column]);
               
            }
        }
    }
}
