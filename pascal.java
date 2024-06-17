import java.util.Scanner;
public class pascal 
{
   public static void main(String args[])
   {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    int n=obj.nextInt();
   
    for(int i=1;i<=n;i++)
    {
        int a=1;
        for(int j=1;j<=i;j++)
        {
            System.out.print(a);
            a=a*(i-j)/j;
        }
        System.out.println();
    }
   }
    
}

