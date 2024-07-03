
/*  Abstraction : data hiding
    types : 1 . interface
            we can avhieve 100% abstraction
            we cant define body of the class and method
            abstract method
            2. abstract class and abstract method
            we can achieve 0-100%
            we can create abstract and also concrete method
            we can define the body
*/

abstract class Vehical {
    int tyres;

    abstract public void start();

    public void body() {
        System.out.println("Hello wrodl");
    }
}

class Bike extends Vehical {
    public void start() {
        tyres = 2;
        System.out.println("have " + tyres + "tyres");
        System.out.println("Bike starts with kicks");
    }
}

class Cars extends Vehical {
    public void start() {
        tyres = 4;
        System.out.println("have " + tyres + "tyres");
        System.out.println("Car starts with keys");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        Cars c = new Cars();
        c.start();
    }
}
