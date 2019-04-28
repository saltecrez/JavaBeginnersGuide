package chapter7;

class Triangle6 extends TwoDShape6 {

    private String style;

    // A default constructor. 
    Triangle6() {
        super();
        style = "none";
    }

    // Constructor 
    Triangle6(String s, double w, double h) {
        super(w, h); // call superclass constructor 

        style = s;
    }

    // One argument constructor. 
    Triangle6(double x) {
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
