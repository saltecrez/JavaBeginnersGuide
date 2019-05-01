package chapter9;

class ExcDemo2 {

    public static void main(String args[]) {

        try {
            ExcTest2.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception  
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
