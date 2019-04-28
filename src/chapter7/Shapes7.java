package chapter7;

class Shapes7 {

    public static void main(String[] args) {
        ColorTriangle7 t1
                = new ColorTriangle7("Blue", "outlined", 8.0, 12.0);
        ColorTriangle7 t2
                = new ColorTriangle7("Red", "filled", 4.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}
