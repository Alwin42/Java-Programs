import java.util.Scanner;
class pal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string \n");
        str = sc.nextLine();
        int flag=0;
        int len=str.length();
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1))
            {
                flag =1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not a palindrome ");
    }
}