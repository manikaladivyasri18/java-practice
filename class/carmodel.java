class Car
{
    String brand;
    int model;
    long cost;
    Car(String brand,int model,long cost)
    {
        this.brand=brand;
        this.model=model;
        this.cost=cost;

    }
}
public class carmodel
{
    public static void main(String a[])
    {
        Car C1=new Car("Swift",20, 2500000);
        Car C2=new Car("BMW", 25, 400000);
        System.out.println("CAR1");
        System.out.println(C1.brand);
        System.out.println(C1.model);
        System.out.println(C1.cost);
        System.out.println("CAR2");
        System.out.println(C2.brand);
        System.out.println(C2.model);
        System.out.println(C2.cost);

       



    }
}