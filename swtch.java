import java.util.*;
public class swtch
{
    public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    n=sc.nextInt();
    switch(n)
    {
       case 1:
        System.out.println("sunday");
       break;
        case 2:
        System.out.println("monday");
        break;
        case 3:
        System.out.println("Tuesday");
        break;
        case 4:
        System.out.println("wednesday");
        break;
        case 5:
        System.out.println("thursday");
        break;
        case 6:
        System.out.println("friday");
        break;
        case 7:
        System.out.println("saturday");
        break;
        default:
        System.out.println("invalid");
    }
}
}