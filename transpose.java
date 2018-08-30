package Core_java04;

import java.util.Scanner;

public class transpose {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE(r*c) : ");
        int r=sc.nextInt();
        int c=sc.nextInt();


        int arr[][]=new int[r][c];
        System.out.println("ENTER THE ELEMENTS ON ARRAY");
        for(int i =0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();




        System.out.println("TRANSPOSE OF MATRIX ");
        for( int i =0; i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(arr[j][i]+"  ");
            }
            System.out.println("\n");

        }




    }

}
