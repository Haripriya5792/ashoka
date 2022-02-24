import java.util.*;
public class matrixmul
{
    public static void main(String args[])
    {
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r1");
        r1=sc.nextInt();
        System.out.println("Enter c1");
        c1=sc.nextInt();
        System.out.println("Enter r2");
        r2=sc.nextInt();
        System.out.println("Enter c2");
        c2=sc.nextInt();
        if(c1!=r2)
        {
            System.out.println("matrix MULTIPLICATION not possible");
        }
        else{
            int a[][]=new int[r1][c1];
            int b[][]=new int[r2][c2];
            int res[][]=new int[r1][c2];
            System.out.println("Enter a values \n");
            
        }
    }
}