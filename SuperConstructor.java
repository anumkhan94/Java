class Superclass{
    int age;

    Superclass(int age){
        this.age = age;
    }

    public void getAge(){
        System.out.println("The value of variable named age in super class is: "+age);
    }
}

public class SuperConstructor extends Superclass{
    SuperConstructor(int age){
        super(age);
    }

    public static void main(String[] args){
        SuperConstructor sc = new SuperConstructor(24);
        sc.getAge();
    }
}
