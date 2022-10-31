
import java.util.*;
import java.io.*;
public class MarksClass
{
   public static void main(String args[])
   {int marks,i,a,maths,eng,hist,geo,polsc,highest,lowest,average,mh=0,ml=100,eh=0,el=100,hh=0,hl=100,gh=0,gl=100;
       int psh=0,psl=100,ClassTotal=0,ClassAverage,ClassAverageH=0,ClassAverageL=100,mt=0,gt=0,pt=0,ht=0,et=0,ma,ea,pa,ha,ga;
       Scanner S=new Scanner(System.in);
    for(i=1;i<=8;i++)
    {System.out.println("Please enter the marks secured in Mathematics for student "+i);
        maths=S.nextInt();
        mt=mt+maths;
        if (maths>mh){mh=maths;}
        if (maths<ml){ml=maths;}
        highest=maths;lowest=maths;
        System.out.println("Please enter the marks secured in English for student "+i);
        eng=S.nextInt();
        et=et+eng;
        if (eng>mh){eh=eng;}
        if (eng<el){el=eng;}
        if (eng>highest){highest=eng;}
        if (eng<lowest){lowest=eng;}
        System.out.println("Please enter the marks secured in History for student "+i);
        hist=S.nextInt();
        ht=ht+hist;
        if (hist>hh){hh=hist;}
        if (hist<hl){hl=hist;}
        if (hist>highest){highest=hist;}
        if (hist<lowest){lowest=hist;}
        System.out.println("Please enter the marks secured in Geography for student "+i);
        geo=S.nextInt();
        gt=gt+geo;
        if (geo>gl){gh=geo;}
        if (geo<gl){gl=geo;}
        if (geo>highest){highest=geo;}
        if (geo<lowest){lowest=geo;}
        System.out.println("Please enter the marks secured in Political Sceince for student "+i);
        polsc=S.nextInt();
        pt=pt+polsc;
        if (polsc>psh){psh=polsc;}
        if (polsc<psl){psl=polsc;}
        if (polsc>highest){highest=polsc;}
        if (polsc<lowest){lowest=polsc;}
        average=(maths+eng+hist+geo+polsc)/5;
        if(average>ClassAverageH){ClassAverageH=average;}
         if(average>ClassAverageL){ClassAverageL=average;}
        ClassTotal=ClassTotal+average;
        System.out.println("*********************************************************************");
        System.out.println("Highest for student "+i+" is:"+highest);
        System.out.println("Lowest for student "+i+" is:"+lowest);
        System.out.println("Average for student "+i+" is:"+average);
        System.out.println("*********************************************************************");
    }
    ma=mt/8;
    ga=gt/8;
    pa=pt/8;
    ea=et/8;
    ha=ht/8;
    System.out.println("");
    System.out.println("");
    System.out.println("Highest in Mathematics :"+mh);
    System.out.println("lowest in Mathematics :"+ml);
    System.out.println("Class Average in Mathematics :"+ma);
    System.out.println("Highest in English :"+eh);
    System.out.println("lowest in English :"+el);
    System.out.println("Class Average in English :"+ea);
    System.out.println("Highest in History :"+hh);
    System.out.println("lowest in History :"+hl);
    System.out.println("Class Average in Hisory :"+ha);
    System.out.println("Highest in Geography :"+gh);
    System.out.println("lowest in Geography :"+gl);
    System.out.println("Class Average in Geography :"+ga);
    System.out.println("Highest in Pol.Sc. :"+psh);
    System.out.println("lowest in Pol.Sc. :"+psl);
    System.out.println("Class Average in Pol.Sc. :"+pa);
    System.out.println("************************************************************");
    ClassAverage=ClassTotal/8;
    System.out.println("");
    System.out.println("");
    System.out.println("Class Average is : "+ClassAverage);
    System.out.println("Highest Average is : "+ClassAverageH);
    System.out.println("Lowest Average is : "+ClassAverageL);
    System.out.println("*********************************************************************");
    System.out.println("THANK YOU");
    }
}
