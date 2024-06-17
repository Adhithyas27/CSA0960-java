
import java.util.Arrays;
import java.util.Scanner;


public class array 
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    int sum=0;
    System.out.println("Enter the size of array:");
    int k=obj.nextInt();
    int [] a=new int[k];
    for(int i=0;i<k;i++)
    {
        System.out.print("Enter the "+i+" th element:");
        a[i]=obj.nextInt();
        

    }
    String s=Arrays.toString(a);
    System.out.println(s);
    System.out.println("Enter the index to insert"+s.charAt(2));
    for(int i=1;i<=10;)
    {
        System.out.println(s.charAt(i));
        i+=3;
    }
    
 }




}
