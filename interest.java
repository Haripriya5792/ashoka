import java.util.*;
class interest
{
    public static void main(String args[])
    {
        int p;
        int t; 
        int r;
        float i,a;
        i= p*t*r/100;
        a= p+i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount:");
        p=sc.nextInt();
        System.out.println("enter time:");
        t=sc.nextInt();
        System.out.println("enter rate of interest:");
        r=sc.nextInt();
        System.out.println("the simple interest is:"+i);
        system.out.println("total amount:"+a);
    }
}