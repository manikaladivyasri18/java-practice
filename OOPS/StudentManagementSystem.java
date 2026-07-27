import java.util.Scanner;
class Student
{
    String Branch;
    String Name;
    int RollNo;
    int PythonMarks;
    int JavaMarks;
    int DBMSMarks;
    Student(String N,String B,int RN,int PM,int JM,int DM)
    {
        
        Branch=B;
        Name=N;
        RollNo=RN;
        PythonMarks=PM;
        JavaMarks=JM;
        DBMSMarks=DM;

    }
    public int CalculateTotal()
    {
        return PythonMarks+JavaMarks+DBMSMarks;
    }
    public double CalculateAverage()
    {
        return CalculateTotal()/3.0;
    }
    public void display()
    {
        System.out.println("Student Details");
        System.out.println("Name:"+Name);
        System.out.println("Branch:"+Branch);
        System.out.println("RollNo:"+RollNo);
        System.out.println("PythonMarks:"+PythonMarks);
        System.out.println("JavaMarks:"+JavaMarks);
        System.out.println("DBMSMarks:"+DBMSMarks);
        System.out.println("TotalMarks:"+CalculateTotal());
        System.out.println("Average:"+CalculateAverage());
        System.out.println("**********");

    }


}
public class StudentManagementSystem
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student(
            sc.nextLine(),
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
            );
        sc.nextLine();
        Student s2=new Student(
            sc.nextLine(),
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
            );
        sc.nextLine();
        Student s3=new Student(
            sc.nextLine(),
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
            );
        s1.display();
        s2.display();
        s3.display();
    }
}