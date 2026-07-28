import java.util.Scanner;
class Student
{
    private String Name;
    private int rollno;
    private int pythonMarks;
    private int javaMarks;
    private int dbmsMarks;
    private double averageMarks;
    private int totalMarks;
    public void  setMarks(String Name,int rollno,int pythonMarks,int javaMarks,int dbmsMarks)
    {
        this.Name=Name;
        this.rollno=rollno;
        this.pythonMarks=pythonMarks;
        this.javaMarks=javaMarks;
        this.dbmsMarks=dbmsMarks;

    }
    public String getMarks1()
    {
        return Name;
    }
    public int getMarks2()
    {
        return rollno;
    }
    public int getMarks3()
    {
       return pythonMarks; 
    }
    public int getMarks4()
    {
        return javaMarks;

    }
    public int getMarks5()
    {
        return dbmsMarks;
    }
    public int getMarks6()
    {
        return pythonMarks+javaMarks+dbmsMarks;
    }
    public double getMarks7()
    {
        return getMarks6()/3.0;
    }
    public void display()
    {
        System.out.println("------STUDENT DETAILS-----");
        System.out.println("Name:"+getMarks1());
        System.out.println("Rollno:"+getMarks2());
        System.out.println("PythonMarks:"+getMarks3());
        System.out.println("JavaMarks:"+getMarks4());
        System.out.println("dbmsMarks:"+getMarks5());
        System.out.println("TotalMarks:"+getMarks6());
        System.out.println("AverageMarks:"+getMarks7());



    }
}
public class studentgrade
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            Student s=new Student();
            String Name=sc.nextLine();
            int rollno=sc.nextInt();
            int pythonMarks =sc.nextInt();
            int javaMarks=sc.nextInt();
            int dbmsMarks =sc.nextInt();
            s.setMarks(Name,rollno,pythonMarks,javaMarks,dbmsMarks);
            s.display();
            if(s.getMarks7()>=90)
            {
                System.out.println("A");

            }
            else if(s.getMarks7()>=75)
            {
                System.out.println("B");
            }
            else if(s.getMarks7()>=65)
            {
                System.out.println("C");
            }
            else
            {
                System.out.println("FAIL");
            }

        }


        
    }
}