import java.util.Scanner;
class Linearsearch2
{
    public static int linsearch(int n,int arr[],int target)
    {
        for(int i=0;i<n;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
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
        System.out.println(linsearch(n,arr,target));
    }
}
