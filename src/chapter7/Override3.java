package chapter7;

class Override3 {

    public static void main(String[] args) {
        B3 subOb = new B3(1, 2, 3);

        subOb.show(); // this calls show() in B 
    }
}
