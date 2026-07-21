import java.util.Scanner;
class student
{
    String Name;
    int rollno;
    String Branch;
}
public class studentdetails
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        student s1=new student();
        student s2=new student();
        System.out.println("STUDENT 1");
        s1.Name=sc.nextLine();
        s1.rollno=sc.nextInt();
        sc.nextLine();
        s1.Branch=sc.nextLine();
        

        System.out.println("STUDENT 2");
        s2.Name=sc.nextLine();
        s2.rollno=sc.nextInt();
        sc.nextLine();
        s2.Branch=sc.nextLine();
    
        System.out.println(s1.Name);
        System.out.println(s1.rollno);
        System.out.println(s1.Branch);

        System.out.println(s2.Name);
        System.out.println(s2.rollno);
        System.out.println(s2.Branch);



        
       

    }
}