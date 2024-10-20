import java.util.Scanner;
class Frequency
{
    public static void main(String args[])
    {
        String s;
        char ch;
        int c;
        Scanner sc = new Scanner(System.in);
         {
            System.out.println("Enter the String");
            s = sc.nextLine();
            System.out.println("Enter the Character");
            ch = sc.nextLine().charAt(0);
            c = 0;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                c++;
            }
        }
        System.out.println("Frequency "+c);
    } 
}
