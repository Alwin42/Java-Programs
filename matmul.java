import java.util.Scanner;
class matmul
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2,i,j,k;
		
		System.out.println("Enter the rows and columns of the matrix 1");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the rows and columns of the matrix 2");
		r2=sc.nextInt();
		c2=sc.nextInt();
		
		if(c1!=r2)
		{
			System.out.println("Multiplication not possible!");
			
		}
		else
		{
		int [][]mat1=new int[r1][c1];
		int [][]mat2=new int[r2][c2];
		int [][]matres=new int[r1][c1];
		System.out.println("Enter the elements of matrix 1");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
			
		}
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
			  for(k=0;k<c1;k++)
			  {
				  matres[i][j]=mat1[i][k]*mat2[i][k];
			  }
			}
		}	
		System.out.println("result matrix = ");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(matres[i][j]+" ");
				
			}
			System.out.println(" ");
		}
			
		
	}
}
}

