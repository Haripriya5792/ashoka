class Vehicle
{
    void speed()
    {
        System.out.println("100kmph");
    }
} 
class Car extends Vehicle
{
    void ride()
    {
        System.out.println("yes");
    }
}
class Truck extends Vehicle
{
    void run()
    {
        System.out.println("good");
        
    }
}
class Electric extends Car
{
    void charging()
    {
        System.out.println("40kwh");
        
    }
}
class Petrol extends Car
{
    void capacity()
    {
        System.out.println("100lt");
        
    }
}
class Exinherit
{
    public static void main(String args[])
    {
        Vehicle vh=new Vehicle();
        vh.speed();
    
        Truck tr=new Truck();
        tr.run();
        Car cr=new Car();
        cr.ride();
        cr.speed();
        Electric ec=new Electric();
    
        ec.charging();
        Petrol pt=new Petrol();
       pt.capacity();
       pt.speed();
    }
}