package Core_java04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class matrix
{
    //Taking a 2D array for matrix and rows,cols
    int arr[][];
    int r,c;

    //intializing r, c and allot memory for array
    matrix(int r,int c)
    {
        this.r=r;
        this.c=c;
        arr=new int[r][c];
    }
    //accept 2D array from keyboard and return it
    int[][]getMatrix() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



        //StringTokenizer is useful to accept each row as a single string and then
        //divide it into token represents an array element.
        StringTokenizer st;


        for (int i=0;i<r;i++)
        {
            String s=br.readLine();
            st=new StringTokenizer(s," ");
            for (int j=0;j<c;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        return arr;
    }


    //accept two 2D arrays and find sum matrix and return it.
    int[][] findSum(int a[][],int b[][])
    {
        int temp[][]=new int[r][c];

        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                temp[i][j]=a[i][j]+b[i][j];
            return temp;
    }



    //Display the resultant 2D array as a matrix.
    void displayMatrix(int res[][])
    {
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
public class Matrix_Sum
{
    public static void main(String args[])throws IOException
    {
        //Create 2 objects to matrix class, since each object
        //contains an array

        matrix obj1=new matrix(3,3);//3X3 matrix
        matrix obj2=new matrix(3,3);//3X3 matrix

        //take 3 references for 2D arrays.
        int x[][],y[][],z[][];
        System.out.println("\n Enter the Element for the First Matrix :");
        x=obj1.getMatrix();
        System.out.println("\n Enter the Element for the Second Matrix :");
        y=obj2.getMatrix();

        //add the matrices and return sum matrix into z
        z=obj1.findSum(x,y);

        System.out.println("\nThe Sum matrix is :");
        obj2.displayMatrix(z);

    }
}
