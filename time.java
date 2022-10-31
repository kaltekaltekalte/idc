import java.util.Scanner;
public class time
{
   public static void main()
   {
       Scanner sc = new Scanner(System.in);
       for (int n=0;n<100000;n++)
       {
       System.out.println("This is a program of calculating the loss of time due to the systematic error in the calendar of calculating a year as 365.35 instead of 365.242.");
       System.out.println("The 0.008 day difference adds up in a large amount of time to create a significant impact."); 
       System.out.println("When you put the correct values of your age and time, you would get the details in the program of lost time, it will tell us the exact amount of seconds, minutes and hours lost due to the systematic error and the restrictions of the calendar."); 
       System.out.println("Please be sure to enter only integers and to enter the values within the limits of the possibillities of time");
       System.out.println("");
       System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
       
       
       System.out.println("input birth year"); System.out.println("");System.out.println("");
       Double birth_year = sc.nextDouble();
       System.out.println("input birth month in numbers"); System.out.println("");System.out.println("");
       Double birth_day = sc.nextDouble();
       System.out.println("input birth days"); 
       Double birth_month = sc.nextDouble();
       System.out.println("input birth hour in 24 hour format"); System.out.println("");System.out.println("");
       Double birth_hour = sc.nextDouble();
       System.out.println("input birth minute"); System.out.println("");System.out.println("");
       Double birth_minute = sc.nextDouble();
       System.out.println("input current year");
       
       
       Double current_year = sc.nextDouble();
       System.out.println("input current month in numbers"); System.out.println("");System.out.println("");
       Double current_month = sc.nextDouble();
       System.out.println("input current days"); 
       Double current_day = sc.nextDouble();
       System.out.println("input current hour in 24 hour format"); System.out.println("");System.out.println("");
       Double current_hour = sc.nextDouble();
       System.out.println("input current minute"); System.out.println("");System.out.println("");
       Double current_minute = sc.nextDouble();
       
       
       Double year =current_year - birth_year;
       Double month =current_month - birth_month;
       Double day =current_day - birth_day;
       Double hour =current_hour - birth_hour;
       Double minute =current_minute - birth_minute;
       
       
       Double time_lost = (691.2*year)+(57.6*month)+((691.2/365.242)*day)+((691.2/8760)*hour)+((691.2/525600)*minute);
       
       System.out.println(time_lost+ " seconds"); 
       System.out.println(time_lost/60+ " minutes"); 
       System.out.println(time_lost/3600+ " hours"); 
       
       

    }
}
}
