class Mobile
{
    private String mobileName;
    private String mobileModel;
    private int cost;
    public void setValue(String mobileName,String mobileModel,int cost)
    {
        this.mobileName=mobileName;
        this.mobileModel=mobileModel;
        this.cost=cost;
    }
    public String  getValue1()
    {
        return mobileName;

    }
    public String getValue2()
    {
        return mobileModel;
    }

    public int getValue3()
    {
        return cost;
    }
    public void  display()
    {
        System.out.println("Mobile Details");
        System.out.println("**********");
        System.out.println("Mobile name:"+getValue1());
        System.out.println("Mobile Model:"+getValue2());
        System.out.println("Cost:"+getValue3());


    }
    

    
}
public class mobiledetails
{
    public static void main(String a[])
    {
        Mobile m1 = new Mobile();
        Mobile m2=new Mobile();
        m1.setValue("Samsung","48gf",430000);
        m2.setValue("Applephone","54ft",70000);
        m1.display();
        m2.display();

    }
}