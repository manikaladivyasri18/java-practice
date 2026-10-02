import java.util.HashMap;
import java.util.Scanner;
public class firstchar
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        String s=sc.nextLine();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray())
        {
            if(map.get(ch)==1)
            {
                System.out.println(ch);
                break;
            }
        }
    }




    
}