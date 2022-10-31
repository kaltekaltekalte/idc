
import java.util.*;
import java.io.*;
public class SampleQuestion
{
   public static void main(String args[])
   {   int stud,sub,i,a,mark,total=0,average,d=0,f=0,m=0,p=0;
       String name;
       Scanner S=new Scanner(System.in);
       System.out.println("Enter number of students in class");
       stud=S.nextInt();
       System.out.println("Enter number of subjects ");
       sub=S.nextInt();
       String studname[]=new String[stud];
       int studMarks[][]=new int[stud][sub];
       int studTotal[]=new int[stud];
       int Aaverage[]=new int[stud];// we take the array name as Aaverage as average as a variable co-exists
       String grade[]=new String[stud];
       for(i=0;i<stud;i++)
        { for(a=0;a<sub;a++)
           {System.out.println("Enter the name");
               name=S.next();
               studname[i]=name;
               System.out.println("Enter the marks");
               mark=S.nextInt();
               total=total+mark;
            studMarks[i][a]=mark;
        }
        studTotal[i]=total;
        average=total/sub;
        Aaverage[i]=average;
    }
        for(i=0;i<stud;i++){
          for(a=0;a<sub;a++)
            {if(Aaverage[i]>=70){grade[i]=("Distinction");d++;}
             if(Aaverage[i]<70&&Aaverage[i]>=55){grade[i]=("Merit");m++;}
             if(Aaverage[i]<55&&Aaverage[i]>=40){grade[i]=("Pass");p++;}
             if(Aaverage[i]<40){grade[i]=("Fail");f++;}
          }
               }
         for(i=0;i<stud;i++){
          for(a=0;a<sub;a++)
            {System.out.println("Name : "+studname[i]);
                System.out.println("Total marks : "+studTotal[i]);
                System.out.println("Average : "+Aaverage[i]);
                System.out.println("Name : "+studname[i]);
                System.out.println("Grade : "+grade[i]);
          }
               }
               System.out.println("Number of distinctions : "+d);
               System.out.println("Number of merits : "+m);
               System.out.println("Number of pass : "+p);
               System.out.println("Number of fails : "+f);
    }
}
