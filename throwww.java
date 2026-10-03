class AgeException extends Exception{
    public AgeException(String s){
        super(s);
    }
}


public class throwww {
    public static void main(String[] args) {
        try {
            int age = 12;
            if (age < 18) {
                throw new AgeException("Age");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
