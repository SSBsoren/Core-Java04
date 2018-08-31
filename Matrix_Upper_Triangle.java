package Core_java04;


import java.util.Scanner;

public class Matrix_Upper_Triangle {
    public static void main(String args[]) {
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the matrix : ");
            int m = sc.nextInt();
            int A[][] = new int[m][m];

            /* Inputting the matrix */
            System.out.print("Enter the element : ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {

                    A[i][j] = sc.nextInt();
                }
            }

            /* Printing the matrix */
            System.out.println("--------------------------------");
            System.out.println("The Matrix is : ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("------------------------------");

            int p = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < i; j++) {
                    /* Checking that the matrix is Upper Triangular or not */
                    if (A[i][j] != 0) // All elements below the diagonal must be zero
                    {
                        p = 1;
                        break;
                    }
                }
            }

            if (p == 0)
                System.out.println("The matrix is Upper Triangular");
            else
                System.out.println("The matrix is not Upper Triangular");
        }
    }
}