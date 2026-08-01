class animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class dog extends animal
{
    @Override
    void eat()
    {
        System.out.println("Dog is eating");
    }

}
public class Inheritance3
{
    public static void main(String a[])
    {
        animal a=new.dog();
        a.eat();
    }
}