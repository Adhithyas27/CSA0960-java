import java.util.Scanner;
public class leap 
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the year:");
    int a=obj.nextInt();
    if(a%4==0 || a%100==0 && a%400==0)
    {
        System.out.println("It is leap year");
    }
    else
    {
        System.out.println("It is not a leap year");
    }
 }

}
