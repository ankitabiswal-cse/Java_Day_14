public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int result = 10/2;
    System.out.println("Result = "+result);
        }
        catch(ArithmeticException e){
            System.out.println("error Occurred");
        }
        finally{
            System.out.println("Finally Block Executed");
        }
    }
}
