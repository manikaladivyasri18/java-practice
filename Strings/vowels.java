import java.util.Scanner;
public class vowels
{
    public static void main(String a[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            s=s.toLowerCase();
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {

                count=count+1;
            }



        }
        System.out.println(count);


    }
}