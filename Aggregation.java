class Address{
    String dis, coun;

    Address(String dis, String coun){
        this.dis = dis;
        this.coun = coun;
    }
}

class Man{
    int id;
    Address a;

    Man(int id, Address a){
        this.id = id;
        this.a  = a;
    }

        void display(){
        System.out.println(id + " " + a.dis + " " + a.coun);
    }
}


public class Aggregation {

    public static void main(String[] args) {

        Address a = new Address("Jkt", "Bd");
        Man m = new Man(120, a);

        m.display();
        
    }
}
