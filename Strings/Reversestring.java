import java.util.Scanner;
public class Reversestring
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));

        }
       

        
    }

}