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
    public String getName()
    {
        return Name;
    }
    public int getrollno()
    {
        return rollno;
    }
    public int getpythonMarks()
    {
       return pythonMarks; 
    }
    public int getjavaMarks()
    {
        return javaMarks;

    }
    public int getdbmsMarks()
    {
        return dbmsMarks;
    }
    public int gettotalMarks()
    {
        return pythonMarks+javaMarks+dbmsMarks;
    }
    public double getaverageMarks()
    {
        return gettotalMarks()/3.0;
    }
    public void display()
    {
        System.out.println("------STUDENT DETAILS-----");
        System.out.println("Name:"+getName());
        System.out.println("Rollno:"+getrollno());
        System.out.println("PythonMarks:"+getpythonMarks());
        System.out.println("JavaMarks:"+getjavaMarks());
        System.out.println("dbmsMarks:"+getdbmsMarks());
        System.out.println("TotalMarks:"+gettotalMarks());
        System.out.println("AverageMarks:"+getaverageMarks());



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
            if(s.getaverageMarks()>=90)
            {
                System.out.println("A");

            }
            else if(s.getaverageMarks()>=75)
            {
                System.out.println("B");
            }
            else if(s.getaverageMarks()>=65)
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