import java.util.*;
public class palindromerange
{
    public static void main(String args[])
    {
        int n1,n2,r1,r2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter range");
        r1=sc.nextInt();
        r2=sc.nextInt();
        System.out.println("palindrome numbers within the range are:");
        for(int i=r1;i<=r2;i++)
        {
            n1=i;
            n2=0;
        
        while(n1>0)
        {
            int rem=n1%10;
            n2=n2*10+rem;
            n1=n1/10;
        }
        if(i==n2)
        {
            System.out.println(i+" ");
        }
        
    }
}
}