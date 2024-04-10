public class Expection_handling {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        try{
            System.out.println("a/b");
        }
        catch(ArithemeticException e){
            System.out.println("e.toString()")
        }
    }
}

//Have the exception message with the use of the getMessage()

class mine{
    public static void main(String[] args) {
        int a=5;
        int b=3;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
    }
}''

//