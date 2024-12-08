public class UncommonErrorSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            int index = 2;
            if(index >=0 && index < arr.length){
                System.out.println(arr[index]);
            } else {
                System.out.println("Index out of bounds");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: "+e);
        }
        String s = "hello";
        try{
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("Exception: "+e);
        }
        int x = 5;
        int y = 0;
        try{
            if(y != 0){
                int z = x/y;
            } else {
                System.out.println("Division by zero");
            }
        } catch (ArithmeticException e){
            System.out.println("Exception: "+e);
        }
    }
}