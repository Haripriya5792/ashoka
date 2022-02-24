import java.util.*;
public class fib
{
    public static void main(String args[])
    {
        int count,n1=0,n2=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter count");
        count=sc.nextInt();
        System.out.println("the Fibonacci series are");
        int i=1;
        while(i<=count)
        {
            System.out.println(n1+" ");
            int sum=n1+n2;
            n1=n2;
            n2=sum;
            i++;
        }
    
    }
}