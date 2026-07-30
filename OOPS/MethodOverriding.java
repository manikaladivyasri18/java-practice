class Animal
{
    void sound()
    {

        System.out.println("Animal Sound");
    }

}
class Dog extends Animal
{
    @Override
    void sound()
    {
        super.sound();
        System.out.println("Dog is barking");
    }

}
public class MethodOverriding
{
    public static void main(String a[])
    {
        Dog d=new Dog();
        d.sound();
    }
}