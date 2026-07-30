class employee
{
    void Work()
    {
        System.out.println("employee is working");
    }
}
class Manager extends employee
{
    @Override
    void Work()
    {
        System.out.println("Manager is managing the team");
    }

}
public class Employee
{
    public static void main(String a[])
    {
         Manager m=new Manager();
         m.Work();
    }
}