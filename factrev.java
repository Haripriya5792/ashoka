import java.util.*;
public class factrev
{
    public static void main(String args[])
    {
        int factorial=1,n;
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            factorial=factorial*i;
            
        }
        System.out.println(factorial);
    }
}