//write a program for a method  without parameters but with a return type
package Core_java04;

class sample
{
    private double num1,num2;
    sample(double x ,double y)
    {
        num1=x;
        num2=y;
    }
    double sum()
    {
        double result=num1+num2;
        return result;
    }
}
public class method {
    public static void main(String args[])
    {
        sample sam=new sample(80,90);
        double x=sam.sum();
        System.out.println("Result = "+x);
    }
}
