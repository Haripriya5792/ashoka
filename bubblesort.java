import java.util.*;
public class bubblesort
{
    public static void main(String args[])
    {
        int n,i,j,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        {
           System.out.println("after sorting"+a[i]);
        }
    }
}