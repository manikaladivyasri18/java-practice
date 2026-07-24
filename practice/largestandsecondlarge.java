import java.util.Scanner;
public class largestandsecondlarge
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int max1;
        int max2;
        if(arr1[0]>arr1[1])
        {
            max1=arr1[0];
            max2=arr1[1];
        }
        else{
            max1=arr1[1];
            max2=arr1[0];
        }
        
        for(int i=2;i<n;i++)
        {
            if(max1<arr1[i])
            {
                max2=max1;
                max1=arr1[i];
            }
            else if(arr1[i]>max2)
            {
                max2=arr1[i];
            }
            
        }
        System.out.println("Largest"+" = "+max1);
        System.out.println("Second Largest"+" = "+max2);
    
    }
}