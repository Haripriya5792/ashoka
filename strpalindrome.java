import java.util.*;
public class strpalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st1,st2="";
        System.out.println("Enter a string");
        st1=sc.next();
        for(int i=0;i<st1.length();i++)
        {
            st2=st1.charAt(i)+st2;
        }
        if(st1.equals(st2))
        System.out.println("it is a palindrome");
        else
        System.out.println("not a palindrome");
    }
}