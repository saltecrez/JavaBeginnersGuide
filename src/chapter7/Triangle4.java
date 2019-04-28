package chapter7;

class Triangle4 extends TwoDShape4 {

    private String style;

    // Constructor 
    Triangle4(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
