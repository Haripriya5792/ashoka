import java.util.*;
public class arrsum
{
    public static void main(String args[])
    {
        int sum=0,i,n;
        int a[]=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        n=sc.nextInt();
        System.out.println("Enter values");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
            System.out.println(sum);
        }
    }
}