import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class GroupofAnagrams
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String word:strs) 
        {
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        System.out.println(map.values());
       
        

    }
}