import java.util.Scanner;
public class vote1 
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the age");
    
    int a=obj.nextInt();
    int k=18-a;
    if(a>=18)
    {
        System.out.println("You are eligible to vote");
    }
    else
    {
        System.out.println("You are not eligible to vote"+'\n'+"You should until"+k+" years");

    }

 }    
}
