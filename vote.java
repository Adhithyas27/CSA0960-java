import java.util.Scanner;
public class vote
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the age:");
    int age=obj.nextInt();
    int k=18-age;
    if(age>18)
    {
        System.out.println("You are eligible to vote");
    }
    else
    {
     System.out.println("You are not eligible to vote"+'\n'+"You should wait until "+k+" Years");
    }

 }    

}
