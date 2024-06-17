import java.util.Scanner;

public class revword
{
    public static void main(String args[])
    {
        String a,empty="";
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        a=obj.nextLine();
        int len=a.length();
        for(int i=len-1;i>=0;i--)
        {
            empty=empty+a.charAt(i);
        }
        System.out.println("Reversed word="+empty);


    }
    
}
