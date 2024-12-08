public class UncommonErrorExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); //ArrayIndexOutOfBoundsException: 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: "+e);
        }
        String s = null;
        try{
            System.out.println(s.length()); //NullPointerException
        } catch (NullPointerException e){
            System.out.println("Exception: "+e);
        }
        int x = 5;
        int y = 0;
        try{
            int z = x/y; //ArithmeticException: / by zero
        } catch (ArithmeticException e){
            System.out.println("Exception: "+e);
        }
    }
}