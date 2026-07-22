import java.util.Scanner;
class employee
{
    String Name;
    int id;
    int Salary;

}
public class employeedetails
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        employee e1=new employee();
        employee e2=new employee();
        System.out.println("Employee 1");
        e1.Name=sc.nextLine();
        e1.id=sc.nextInt();
        sc.nextLine();
        e1.Salary=sc.nextInt();
        sc.nextLine();
        System.out.println("Employee 2");
        e2.Name=sc.nextLine();
        e2.id=sc.nextInt();
        sc.nextLine();
        e2.Salary=sc.nextInt();
        sc.nextLine();
        System.out.println(e1.Name);
        System.out.println(e1.id);
        System.out.println(e1.Salary);
        System.out.println(e2.Name);
        System.out.println(e2.id);
        System.out.println(e2.Salary);




        


    }
}