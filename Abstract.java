//All the object need different implementations of the same method
//abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user.
package Core_java04;
abstract class Myclass
{
    abstract void calculate(double x);
}
class sub1 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("SQUARE ="+(x*x));
    }
}
class sub2 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("SQUARE ROOT ="+Math.sqrt(x));
    }
}
class sub3 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("CUBE ="+(x*x*x));
    }
}
public class Abstract {

    public static void main(String[] args) {
        sub1 ob1=new sub1();
        sub2 ob2=new sub2();
        sub3 ob=new sub3();


        ob1.calculate(5);
        ob2.calculate(6);
        ob.calculate(4);


    }

}
