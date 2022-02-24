import java.util.*;
public class numrev
{
    public static void main(String args[])
    {
        int n,r=0,d,t;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println(r);
    }
}