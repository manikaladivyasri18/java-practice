import java.util.Scanner;
public class Character
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            
            System.out.println(s.charAt(i));
        }

    }
}