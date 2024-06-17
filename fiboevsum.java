import java.util.Scanner;

public class fiboevsum 
{
 public static void main(String args[]) 
 
 {
    Scanner obj = new Scanner(System.in);
    int a=0,b=1,c=0,sum=0;
    System.out.print("Enter the limit:");
    int n=obj.nextInt();
    for(int i=1;i<=(n*2);i++)
    {
        c=a+b;
        a=b;
        b=c;

        if(i%2!=0)
        {
            System.out.println(c);
            sum=sum+c;
        }
    
    }
    System.out.println(sum);
    
    
    

    

}
}