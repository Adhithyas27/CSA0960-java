import java.util.Scanner;

public class switch1
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter case:");
    int a=obj.nextInt();
    switch(a)
    {
        case 1:
        System.out.println("Vijay");
        break;

        case 2:
        System.out.println("Vikram");
        break;

        case 3:
        System.out.println("Simbu");
        break;

        default:
        System.out.println("Invalid input");
        break;
    }
  } 
    
}
