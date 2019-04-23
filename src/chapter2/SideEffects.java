package chapter2;

class SideEffects {

    public static void main(String[] args) {
        int i;
        i = 0;

        if (false & (++i < 100)) {
            System.out.println("this won't be displayed");
        }
        System.out.println("if statement is executed: " + i);

        if (false && (++i < 100)) {
            System.out.println("this won't be displayed");
        }
        System.out.println("if statements executed: " + i);
    }
}
