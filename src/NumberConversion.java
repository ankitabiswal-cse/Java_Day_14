public class NumberConversion {
    public static void main(String[] args){

        String number = "abc";

        try{
            int value = Integer.parseInt(number);

            System.out.println("Number :"+value);
        } catch (NumberFormatException e) {

            System.out.println("Invalid Number Form");
        }
    }
}
