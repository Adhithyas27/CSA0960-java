import java.util.Scanner;

public class pi 
{
    public static void main(String args[])
    {
 
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        int p=obj.nextInt();
        System.out.print("Enter the time:");
        int t=obj.nextInt();
        System.out.println("IS he senior citizen:y or n");
        char s=obj.next().charAt(0);
        if(s=='Y' || s=='y')
         {
          i=12;
         }
        else
         {
           i=10;
         }
         float pai=(p*i*t)/100;
       
         System.out.println("Principle intrest="+pai);
    }
}
