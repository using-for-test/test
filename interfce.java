interface printable{
    void print();
}

interface showable{
    void show();
}


class Document implements showable, printable{

    public void print(){
        System.out.println("Jahid");
    }

    public void show(){
        System.out.println("Rayhan");
    }

}

public class interfce {

    public static void main(String[] args){

        Document d = new Document();

        d.print();
        d.show();
    }
    
}
