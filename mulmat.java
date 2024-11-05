import java.util.Scanner;

public class mulmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, r2, c1, c2, i, j, k;
        System.out.println("Enter the number of rows and columns in Matrix 1");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns in Matrix 2");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix Multiplication is not possible");
            return;
        }

        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        int C[][] = new int[r1][c2];

        System.out.println("Enter the elements of Matrix 1");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of Matrix 2");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Multiplication Result");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
