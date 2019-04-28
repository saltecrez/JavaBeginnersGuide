package chapter7;

class Triangle7 extends TwoDShape7 {

    private String style;

    // A default constructor. 
    Triangle7() {
        super();
        style = "none";
    }

    Triangle7(String s, double w, double h) {
        super(w, h); // call superclass constructor 

        style = s;
    }

    // One argument constructor. 
    Triangle7(double x) {
        super(x); // call superclass constructor 

        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
