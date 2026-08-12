
abstract class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    abstract void  sound();
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Dog Barks");
    }

}
class Cat extends Animal
{
    public void sound()
    {
        System.out.println("Cat Meows");
    }

}
class Basicabstract
{
    public static void main(String a[])
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.sound();
        d.eat();
        c.sound();
        c.eat();

    }
}