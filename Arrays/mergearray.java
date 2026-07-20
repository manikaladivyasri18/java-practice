import java.util.Scanner;
public class mergearray
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr3[]=new int[m+n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int j=0;j<m;j++)
        {
            arr3[n+j]=arr2[j];

        }

        for(int i=0;i<m+n;i++)
        {
            System.out.println(arr3[i]);
        }


    }
}