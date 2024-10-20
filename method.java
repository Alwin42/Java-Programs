import java.util.Scanner;
class method
{
    static int plus(int x, int y)
        {
            return x+y;
        }
    static double plusdouble(double p, double q)
    {
        return p+q;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=plus(4,3);
        double num2=plusdouble(4.3,3.33);
        System.out.println("Num1 =" + num1);
        System.out.println("Num2 =" + num2);
    }
}