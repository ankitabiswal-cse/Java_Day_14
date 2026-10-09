public class MultipleException {
    public static void main(String[] args){

        int[] arr  = {10,20,30,40,50};

        try{
            int result = 10/0;

            System.out.println(result);

            System.out.println(arr[5]);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
    }

}
