class animal
{
    void sound()
    {
        System.out.println("Animal Sound");
    }

}
class Dog extends animal
{
    
    @Override
    void sound()
    {
        System.out.println("Dog Bark");
    }
}
public class Animal
{
    public static void main(String a[])
    {
        Dog d=new Dog();
        d.sound();

    }
}





