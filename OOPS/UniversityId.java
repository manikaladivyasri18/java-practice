import java.util.Scanner;
class Student
{
    String Name;
    int Rollno;
    String Branch;
    int Year;
    Student(String n,int r,String b,int y)
    {
        Name=n;
        Rollno=r;
        Branch=b;
        Year=y;


    }
    public String generateid()
    {
        return Branch+"-"+Rollno+"-"+Year;
    }
    public void display()
    {
        System.out.println("Name:"+Name);
        System.out.println("Rollno:"+Rollno);
        System.out.println("Branch:"+Branch);
        System.out.println("Year:"+Year);
        System.out.println("Generated ID :"+generateid());
    }
}
public class UniversityId
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        Student[] students=new Student[3];
        for(int i=0;i<3;i++)
        {
            String Name=sc.nextLine();
            int Rollno=sc.nextInt();
            sc.nextLine();
            String Branch=sc.nextLine();
            int Year=sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<3;i++)
        {
            students[i].display();
        }
    }
}