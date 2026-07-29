import java.util.Scanner;
class Account_details
{
    private String PIN;
    private int deposit;
    private int withdrawal;
    public void setPIN(String PIN,int deposit,int withdrawal)
    {

        this.PIN=PIN;
        this.deposit=deposit;
        this.withdrawal=withdrawal;
    }
    public String getPIN()
    {
        return PIN;
    }
    
    public int  getdeposit()
    {
        return deposit;
    }
    public int getwithdrawal()
    {
        return withdrawal;
    }
    public int  getBalance()
    {
        return getdeposit()-getwithdrawal();
        
    }
    public void display()
    {
        System.out.println("Account details");
        if(PIN.length()==4)
        {
            System.out.println("PIN set Successfully");
        }
        else
        {
            System.out.println("PIN set UnSuccessfully");

        }
        if(getdeposit()>0)
        {
            System.out.println("Amount is deposited");
        }
        else
        {
            System.out.println("Amount is not deposited");

        }
        if(getwithdrawal()<=getBalance())
        {
            System.out.println("Amount withdraw Succesfully");
        }
        else
        {
            System.out.println("Amount withdraw UnSuccesfully");

        }
        System.out.println(getBalance());
        
    }

}





public class AtmMachine
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            Account_details  p1 = new Account_details();
            String PIN=sc.nextLine();
            int deposit=sc.nextInt();
            sc.nextLine();
            int withdrawal=sc.nextInt();
            p1.setPIN(PIN,deposit,withdrawal);
            p1.display();




        }
    }

}