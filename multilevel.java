class Person
{
    void sleep()
    {
        System.out.println("sleeping");
    }
} 
class Priya extends Person
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Hari extends Priya
{
    void talk()
    {
        System.out.println("talking");
        
    }
}
class multilevel
{
    public static void main(String args[])
    {
        Hari pri=new Hari();
        pri.eat();
        pri.sleep();
        pri.talk();
    }
}