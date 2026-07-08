public class leapyear
{
    public static void main(String a[])
    {
        int y=2026;
        if((y%4==0&&y%100!=0)||(y%400==0))
        {
            System.out.println("It is a leapyear");
        }
        else{
            System.out.println("It is not a leapyear");
        }
    }
}