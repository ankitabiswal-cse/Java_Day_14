public class ArrayAccess {
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        try{
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Invalid array index");
        }

        System.out.println("Program Contineous....");
    }
}
