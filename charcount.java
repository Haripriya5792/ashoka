import java.util.*;
public class charcount
{
    public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
    System.out.println(“Enter any string"); 
    String st=sc.next();
   Int count=0;
   for(int i=0;i<st.length();i++)
{
    If(Character.isLetter(st.charAt(i)))
    count++;
    System.out.println(“no of letters:”+count);
}
}
}

