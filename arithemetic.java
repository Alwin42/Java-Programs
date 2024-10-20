import java.util.Scanner;
class arithemetic
{
	public static void main (String args[])
	{
		int n1,n2,sum,mul,div,mod,sub,op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers to perform arithmetic operations ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Modulus");
		System.out.println("Enter your choice");
		op=sc.nextInt();
		switch(op)
		{
			case 1:
			sum=n1+n2;
			System.out.println("Result :"+sum);
			break;
			
			case 2:
			sub=n1-n2;
			System.out.println("Result :"+sub);
			break;
			
			case 3:
			mul=n1*n2;
			System.out.println("Result :"+mul);
			break;
			
			case 4:
			div=n1/n2;
			System.out.println("Result :"+div);
			break;
			
			case 5:
			mod=n1%n2;
			System.out.println("Result :"+mod);
			break;
			
			default :
			System.out.println("Invalid choice : try again..");
			break;
		}
			
			
		}
	}
