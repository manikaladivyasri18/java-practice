import java.util.Scanner;
class Linearsearch
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
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(target==arr[i])
            {
                System.out.println(i);
            }
        }



    }
}