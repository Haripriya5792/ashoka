import java.util.*;
class leap
{
    public static void main(String args[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        x=sc.nextInt();
        if(x%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}