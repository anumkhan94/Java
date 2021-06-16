// The following code will raise as Employee class is abstract and we are trying to instantiate it.
// public class AbstractDemo{
//  public static void main(String[] args){
//      Employee e = new Employee("Anum Khan", "Texas, US", 3);
//      System.out.println("Calling mailcheck using Employee reference!");
//      e.mailcheck();
// } 
// }

public class AbstractDemo {
    public static void main(String[] args){
        Salary s = new Salary("Anum Khan", "Texas, US", 3, 3600.0);
        Employee e = new Salary("John Adams", "Chicago, US",2, 2400.0);
        System.out.println("Call mailcheck using Salary reference: ");
        s.mailcheck();
        System.out.println("\nCall mailcheck using Employee reference: ");
        e.mailcheck();
    }
}
