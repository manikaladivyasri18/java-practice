public class largestnum
{
    public static void main(String a[])
    {
        int num[]={10,8,54,74};
        int max=num[0];
        int ans=0;
        for(int i=0;i<num.length;i++)
        {
            if(max<num[i])
            {
                ans=max;
                max=num[i];
            }
        }
        System.out.println(max);
    }
}