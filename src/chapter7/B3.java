package chapter7;

class B3 extends A3 {

    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k <96> this overrides show() in A 
    void show() {
        System.out.println("k: " + k);
    }
}
