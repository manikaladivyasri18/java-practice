abstract class Employee
{
    String Name;
    Employee(String Name)
    {
        this.Name=Name;
    }
    void  displayName()
    {
        System.out.println(Name);
    }
    abstract void Calculatesalary();
}
class Fulltimeemployee extends Employee
{
   
    Fulltimeemployee(String Name)
    {
        super(Name);
    }
    
    public  void Calculatesalary()
    {
        System.out.println("50000");

    }

}
class parttimeemployee extends Employee
{
   
   parttimeemployee(String Name)
   {
    super(Name);
   }
   public  void Calculatesalary()
   {
        System.out.println("80000");

   }

}


class Employeeabstract
{
    public static void main(String a[])
    {
        Fulltimeemployee ft=new Fulltimeemployee("Divya");
        parttimeemployee pt=new parttimeemployee("Rahul");
        ft.Calculatesalary();
        ft.displayName();
        pt.Calculatesalary();
        pt.displayName();




    }
}