import java.util.Scanner;
public class countevenorodd
{
    public static void main(String a[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                evencount=evencount+1;
            }
            else
            {
                oddcount=oddcount+1;
            }

        }
        System.out.println("Even Count"+ " = "+evencount);
        System.out.println("Odd Count" +" = "+oddcount);


    }
}