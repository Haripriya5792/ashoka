import java.util.*;
public class wordcount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String st=sc.next();
        int count=1;
        for(int i=0;i<st.length()-1;i++)
        {
            if((st.charAt(i)==' ')&&(st.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println("number of words in a string:"+count);
    }
}