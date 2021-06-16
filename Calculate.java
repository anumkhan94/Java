// This is an example of Inheritance
// In this example, if we create an object of CalculateSuper class
// and try to call multiply method of Calculate class, we get the following error
// The method multiply(int, int) is undefined for the type CalculateSuper
// Since multiply() method is defined for the subclass Calculate

class CalculateSuper {
    int z;

    public void addition(int x, int y){
        z = x + y;
        System.out.println("The addition of the two numbers is:"+z);
    }

    public void subtract(int x, int y){
        z = x - y;
        System.out.println("The difference of the two numbers is:"+z);
    }
}

public class Calculate extends CalculateSuper{
    public void multiply(int x, int y){
        z = x * y;
        System.out.println("The multiplication of two numbers is:"+z);
    }

    public static void main(String[]args){
        int n1 = 10, n2=5;
        Calculate calc = new Calculate();
        // CalculateSuper calc = new CalculateSuper();
        calc.addition(n1, n2);
        calc.multiply(n1, n2);
        calc.subtract(n1, n2);
    }

}
