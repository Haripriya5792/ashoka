import java.util.*;
public class matrixadd
{
    public static void main(String args[])
    {
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int sum[][]=new int[r][c];
        
        System.out.println("Enter values of a");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        
        System.out.println("Enter values of b");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
            
        }
        
        System.out.println("the sum is");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
            
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println(sum[i][j]);
            }
        }
    }
}