import java.util.Scanner;
class Employee
{
    private String name;
    private int age;
    private long ph;
    private String address;
    private double salary;
    
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void setph(long ph)
    {
        this.ph=ph;
    }
    public void setaddress(String address)
    {
        this.address=address;
    }
    public void setsalary(double salary)
    {
        this.address=address;
    }
    public double printsalary()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public String getaddress()
    {
        return address;
    }
    public long getph()
    {
        return ph;
    }
    
}