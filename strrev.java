import java.util.*;
public class strrev
{
    public static void main(String args[])
    {
        String st="bitlabs";
        System.out.println("before reverse" +st);
        String st1="";
        char c;
        for(int i=0;i<st.length();i++)
        {
            c=st.charAt(i);
            st1=c+st1;
        }
        System.out.println("reversed string:"+st1);
    }
}