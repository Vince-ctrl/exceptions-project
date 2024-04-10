public class lalala {
    public static void main(String[] args) {
        //let's start with an array error
        int[] array = new int[10];
        int num;
        //this is a pretty easy mistake to make if you forget that arrays start with 0 as opposed to 1
        try {
            array[10] = 15;
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("now, the program can continue");
        //now for an arithmetic exception
        try {
            num = 1/0;
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("continue code");
    }
}
