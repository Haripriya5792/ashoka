import java.util.*;
class product
{
    public static void main(String args[])
    {
        int no,qty;
        String name;
        float cost,bill;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product number");
        no=sc.nextInt();
        System.out.println("enter product name");
        name=sc.next();
        System.out.println("enter product cost");
        cost=sc.nextFloat();
        System.out.println("enter quantity");
        qty=sc.nextInt();
        bill=cost*qty;
        System.out.println("product number:"+no);
        System.out.println("product name:"+name);
        System.out.println("cost:"+cost);
        System.out.println("quantity:"+qty);
        System.out.println("total bill:"+bill);
    }
}