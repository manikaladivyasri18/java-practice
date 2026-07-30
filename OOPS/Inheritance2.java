class Person
{
    void Walk()
    {
        System.out.println("Person is walking");
    }
}
class Student extends Person
{ 
    void Study()
    {
        System.out.println("Student is studying");
    }


}
public class Inheritance2
{
    public static void main(String a[])
    {
        Student s1=new Student();
        s1.Walk();
        s1.Study();
    }
}