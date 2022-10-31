import java.util.*;
import java.io.*;
public class postdiwalipro1
{
public static void main(String args[])
  {int i,a,row,col,mark;
    Scanner S=new Scanner(System.in);
   System.out.println("Enter Row lenght of an array :");
   row=S.nextInt();
   System.out.println("Enter Column lenght of an array :");
   col=S.nextInt();
   System.out.println("Enter"+(row*col)+" elements to store in array :");
   for(i=0;i<(row*col);i++){System.out.println(i);}
   int marks[][]=new int[row][col];
   for(i=0;i<row;i++)
   {for(a=0;a<col;a++)
       {System.out.println("Enter element to store in the array");
         mark=S.nextInt();
         marks[i][a]=mark;}
        }
        System.out.println("Elements in Array are :");
      for(i=0;i<row;i++)
   {for(a=0;a<col;a++)
       {System.out.println("Row["+i+"] :"+"Column["+a+"] :"+marks[i][a]);}}
}
}
