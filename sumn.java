import java.util.*;
public class sumn
{
    public static void main(String args[])
    {
        int i=1,n;
        int sum=0;
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
        sum=sum+i;
        i++;
        }
        System.out.println("sum of numbers is:"+sum);
        
    }
}