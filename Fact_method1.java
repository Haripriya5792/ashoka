import java.util.*;
class Factorial
{
    int n,factorial=1;
    int i=1;
    void fact()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    n=sc.nextInt();
        while(i<=n)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.println(factorial);
    }
}
class Fact_method
{
    public static void main(String args[])
    {
        Factorial f=new Factorial();
        f.fact();
    }
}