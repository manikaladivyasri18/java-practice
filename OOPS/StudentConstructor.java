class student
{
    int age;
    String name;
    student(String n,int a)
    {
        age=a;
        name=n;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);

    }

}
public class StudentConstructor
{
    public static void main(String a[])
    {
    
        student s1=new student("Divya",19);
        student s2=new student("Phani",20);
        s1.display();
        System.out.println();
        s2.display();

        




        

    }


}
