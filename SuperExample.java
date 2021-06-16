class SuperClass{
    int n = 10;
    
    public void display(){
        System.out.println("This is the method of Super Class");
    }
}


public class SuperExample extends SuperClass {
    int n = 20;

    public void display(){
        System.out.println("This is the method of Sub Class");
    }

    public void my_method(){
        SuperExample s = new SuperExample();

        s.display();
        System.out.println("This is the value of variable n in subclass: "+s.n);

        super.display();
        System.out.println("This is the value of variable n in superclass: "+super.n);
    }

    public static void main(String[] args){
        SuperExample sup = new SuperExample();
        sup.my_method();
    }
}
