import java.util.*;
public class greater
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        x=sc.nextInt();
        System.out.println("Enter y");
        y=sc.nextInt();
        System.out.println("enter z");
        z=sc.nextInt();
        if(x>y)
        {
            System.out.println(x);
        }
        else if(y>z)
        {
            System.out.println(y);
        }
        else if(x>z)
        {
            System.out.println(x);
        }
        else{
            System.out.println(z);
        }
    }
}