import java.util.Scanner;
public class Vowelsandconsonants
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(ch))
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                   vowels=vowels+1;
                }
                else
                {
                   consonants=consonants+1;
                }
            }

        }
        System.out.println(vowels);
        System.out.println(consonants);
    }

}