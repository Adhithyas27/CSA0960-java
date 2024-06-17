import java.util.Scanner;
public class eqstring
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String a=obj.nextLine();
        System.out.println("Re-enter the string:");
        String b=obj.nextLine();
        if(a.equals(b))
        {
            System.out.println("Valid string");
        }
        else
        {
           System.out.println("In valid string");
        }
    
    }

    
}
