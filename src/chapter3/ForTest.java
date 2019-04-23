package chapter3;
//output in doppio perchè manca do while ignore
class ForTest {

    public static void main(String[] args)
            throws java.io.IOException {

        int i;
        char ignore;
        System.out.println("Press S to stop");

        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}

