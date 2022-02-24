import java.util.*;
public class operation
{
    public static void main(String args[])
    {
        int a,b,c,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("ADDITION");
        System.out.println("SUBTRACTION");
        System.out.println("MULTIPLICATION");
        System.out.println("Division");
        System.out.println("modulus");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        System.out.println("Enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        switch(ch)
        {
            case 1:
                c=a+b;
                System.out.println("The addition of two numbers is"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("The subtraction of numbers is"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("The product of numbers is"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("The quotient of numbers is"+c);
                break;
            case 5:
                c=a%b;
                System.out.println("The modulus is"+c);
                break;
            default:
                System.out.println("invalid input");
        }
    }
}