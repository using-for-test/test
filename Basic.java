class AAni{
    void eat(){
        System.out.println("Anii eating..");
    }
}


class Cat extends AAni{
   
    void eatt(){
        super.eat();
    }
}



public class Basic{
public static void main(String[] args) {
    
    AAni c = new Cat();
    c.eat();

}
}