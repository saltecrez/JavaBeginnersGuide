package chapter6;

class OverloadDemo {

    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        int resI;
        double resD;

        // call all versions of ovlDemo()  
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): "
                + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.2): "
                + resD);
    }
}
