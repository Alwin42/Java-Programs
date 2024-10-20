import java.util.Scanner;
class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String n = sc.nextLine();
        int flag=0;
        int len=0;
        len=n.length();
        for(int i=0;i<len/2;i++)
        {
            if(n.charAt(i)==n.charAt(len-i-1))
            {
                flag=1;
                break;
            }

        }
        if(flag==1)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }


    }
}
