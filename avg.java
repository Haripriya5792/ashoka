import java.util.*;
public class avg
{
    public static void main(String args[])
    {
        int no,mat,cs,ds;
        float total,avg;
        String name;
        total=mat+cs+ds;
        avg=mat*cs*ds/3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student number:");
        no=sc.nextInt();
        System.out.println("Enter student name:");
        name=sc.next();
        System.out.println("enter marks in mat:");
        mat=sc.nextInt();
        System.out.println("Enter marks in cs:");
        cs=sc.nextInt();
        System.out.println("Enter marks in ds:");
        ds=sc.nextInt();
        System.out.println("student number:"+no);
        System.out.println("student name:"+name);
        System.out.println("marks in subject mat:"+mat);
        System.out.println("marks in subject cs:"+cs);
        System.out.println("marks in subject ds:"+ds);
        System.out.println("total marks:"+total);
        System.out.println("average marks:"+avg);
        
    }
}