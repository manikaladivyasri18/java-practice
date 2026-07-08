import java.util.Scanner;
public class calculator
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2 =sc.nextInt();
        char ch =sc.next().charAt(0);
        switch(ch)
        {
            case '+':
                    System.out.println(num1+num2);
                    break;
            case '-':
                    System.out.println(num1-num2);
                    break;
            case '*':
                    System.out.println(num1*num2);
                    break;
            case '/':
                if(num2!=0)
                {
                    System.out.println(num1/num2);
                }
                else{
                    System.out.println("Not divisible");
                }
                break;
            case '%':
                    if(num2!=0)
                {
                    System.out.println(num1%num2);
                }
                else{
                    System.out.println("Not divisible");
                }
                break;
            default:
                    System.out.println("WRONG");
        }


    }
}