class Human{


    protected int age;

    void setAge(int a){
        this.age = a;
    }

    void getAge(){
        System.out.println(age);
    }


}


public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human();

        h.setAge(12);
        h.getAge();
    }
}
