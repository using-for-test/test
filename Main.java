public class Main {  
    // Static method  
    static void greet() {  
        System.out.println("Hello from the static method!");  
    }  
    // Non-static method  
    void farewell() {  
        System.out.println("Goodbye from a non-static method!");  
    }  
    public static void main(String args[]) {  
        Main obj = new Main();  
        obj.farewell(); //calling non-static method  
        greet(); //calling static method  
    }  
}  