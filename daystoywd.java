
import java.util.Scanner;

public class daystoywd
{
 public static void main(String args[])
{
    System.out.print("Enter the total days:");
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    System.out.println("year:"+a/365);
    System.out.println("week:"+(a%365)/7);
    System.out.println("day:"+(a%365)%7);
}
}
