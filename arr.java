
import java.util.Arrays;
import java.util.Scanner;

public class arr 
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int a=obj.nextInt();
    int [] n=new int[a];
    for(int i=0;i<a;i++)
    {
        System.out.print("Enter the "+i+"Th element of array:");
        n[i]=obj.nextInt();
    }
    Arrays.sort(n);
    System.out.println(Arrays.toString(n));
    

 }  
    
}
