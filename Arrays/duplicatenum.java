import java.util.Scanner;
public class duplicatenum
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            boolean b =false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    b=true;
                    break;
    
                }

            }
            if(!b)
            {
               System.out.println(arr[i]);
            }
        
        }
        

    }
}