class Car{
    void run(){
        System.out.println("Runing..");
    }
}


class Bike extends Car{
    @Override 
    void run(){
        System.out.println("Biking....");
    }
}



public class Polymorphismm {
    public static void main(String[] args) {
        Car c = new Bike();
        c.run();
    }
}
