package chapter3;
//risponde in doppio perchè manca un do while ingore

class DWDemo {


    public static void main(String[] args)
            throws java.io.IOException {
        char ch;

        do {
            System.out.println("Press a key followed by Enter: ");
            ch = (char) System.in.read();

        } while (ch != 'q');
    }
}
