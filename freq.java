import java.util.Scanner;
class freq
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String to count frequency");
    String str = sc.nextLine();
    int len = str.length();
    int i=0;
    System.out.println("Enter the character to count");
    char ch = sc.nextLine().charAt(0);
    int c=0;
    while(i!=len)
    {
        if(str.charAt(i)==ch)
        {
            c++;
        }i++;
    }
    System.out.println("The Frequency of the string is "+c);
    }
}