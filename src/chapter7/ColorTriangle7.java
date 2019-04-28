package chapter7;

class ColorTriangle7 extends Triangle7 {

    private String color;

    ColorTriangle7(String c, String s,
            double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color is " + color);
    }
}
