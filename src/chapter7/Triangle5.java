package chapter7;

class Triangle5 extends TwoDShape5 {

    private String style;

    Triangle5(String s, double w, double h) {
        super(w, h); // call superclass constructor 

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
