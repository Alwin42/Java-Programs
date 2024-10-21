import java.util.*;
public class exceptionhand {
    public static void main(String[] args) throws ArithmeticException 
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Program to perform division");
            System.out.println("Enter the divison number 1");
            int n=sc.nextInt();
            System.out.println("Enter the divison number 2");
            int m=sc.nextInt();
            sc.close();
            if(m==0)
            {
                throw new ArithmeticException("Divide by zero is not possible");
            }
            else{
                int p=n/m;
                System.out.println("Result ="+ p);
               }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("End of operation");
        }
    } 
}
