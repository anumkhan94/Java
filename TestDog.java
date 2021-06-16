class Animals{
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dogg extends Animals{
    public void move(){
        System.out.println("Dogs can walk and run");
    }

    public void bark(){
        System.out.println("Dogs can bark!");
    }
    
}

public class TestDog{
    public static void main(String[] args){
        Animals a = new Animals();
        Animals b = new Dogg();
        Dogg d = new Dogg();

        a.move();
        b.move();
        d.bark();
    }
}
