import java.util.HashMap;
import java.util.Scanner;
public class Anagram
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        String s=sc.nextLine();
        String t=sc.nextLine();
        if(s.length()!=t.length())
        {
            System.out.println("false");
            return;
        }
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(char ch:t.toCharArray())
        {
            if(!map.containsKey(ch)||map.get(ch)==0)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("True");
    

        
    }
  
    

}