import java.util.Scanner;
public class revno 
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number:");
    int rev=0,n;
    int a=obj.nextInt();
    while(a!=0)
    {
     n=a%10;
     rev=rev*10+n;
     a=a/10;
    }
    System.out.println("Reversed number:"+rev);
 }
}
