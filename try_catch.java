public class try_catch {
    public static void main(String[] args) {
        
        try{
            int data = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){

        }
        catch (Exception e){

        }

        finally{
            System.out.println(12);
        }

    }
}
