//write a program to add two matrices and display sum matrix.
package Core_java04;

import java.io.*;
import java.util.*;
public class Matrix {
    //take a 2d array for matrix and rows and cols
    int arr[][];
    int r,c;
    //initialze r,c and allot memory for array
    Matrix(int r,int c)
    {
        this.r=r;
        this.c=c;
        arr=new int[r][c];
    }
    //accept 2d array from keyboard and return it
    int[][]getMatrix()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer is useful to accept each row as a single string and then
        // divide it into token. Each token represents an array element.
        StringTokenizer st;
        for(int i=0;i<r;i++)
        {
            String s=br.readLine();
            st=new StringTokenizer(s," ");
            for(int j=0;j<c;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        return arr;
    }
    //accept 2d array and find sum matrix and return it .
    int[ ][ ] findSum(int a[][],int b[][])
    {
        int temp[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;i<j;i++)
                temp[i][j]=a[i][j]+b[i][j];

        return temp;
    }

    public static void main(String[] args) {


    }

}
