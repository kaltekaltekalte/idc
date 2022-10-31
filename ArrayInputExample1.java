import java.util.Scanner;  
public class ArrayInputExample1   
{  
public static void main()     
{  
int n =0;  
int i =0;
Scanner sc=new Scanner(System.in);  

int[] array = new int[10];  

for(i=0; i<10; i++)  
{  
 
array[i]=sc.nextInt();  
}  
  
for (n=0; n<10; n++)   
{  
System.out.println(array[i]);  
}  
}  
}  