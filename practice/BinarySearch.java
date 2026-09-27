
public class BinarySearch
{
    public static void main(String a[])
    {
       int arr[]={1,2,3,4};
       int target=2;
       int left=0;
       int right=arr.length-1;
       while(left<=right)
       {
          int middle=(left+right)/2;
          if(arr[middle]==target)
          {
            System.out.println(middle);
            break;
          }
          else if(arr[middle]<target)
          {
            left=middle+1;
          }
          else
          {
            right=middle-1;
          }
       }
       if(left>right)
       {
         System.out.println("Element not found");
       }


    }
}

        