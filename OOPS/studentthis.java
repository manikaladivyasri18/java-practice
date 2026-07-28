class Student{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
       System.out.println("Student details");
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
    }

}
public class studentthis
{
    public static void main(String a[])
    {
        Student s1=new Student("Divya",19);
        Student s2=new Student("Phani",18);
        s1.display();
        s2.display();
    }
}