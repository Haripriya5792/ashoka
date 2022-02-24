import java .util.*;
public class sumof
{
    public static void main(String args[])
    {
        int i,sum=0;
        for(i=9;i<300;i++)
        {
            if(i%7==0 && i%63!=0)
            {
                sum=sum+i;
            }
        }
System.out.println(sum);
    }
}