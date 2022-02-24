class Demo 
{
    int n=3,i,f=1;
    
}
interface Demo1
{
   void fact();
}
class Demo2 extends Demo implements Demo1
{
    public void fact()
    {
        for(i=1;i<=n;i++)
        f=f*i;
        System.out.println(f);
        
    }
}
class InterfaceDemo
{
    public static void main(String args[])
    {
        Demo2 de=new Demo2();
        de.fact();
    }
}