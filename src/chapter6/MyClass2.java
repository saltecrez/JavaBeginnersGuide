package chapter6;

class MyClass2 {

    int x;

    MyClass2() {
        System.out.println("Inside MyClass().");
        x = 0;
    }

    MyClass2(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }

    MyClass2(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }

    MyClass2(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }

}
