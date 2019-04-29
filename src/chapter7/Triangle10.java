package chapter7;

class Triangle10 extends TwoDShape10 {

    private String style;

    // A default constructor.  
    Triangle10() {
        super();
        style = "none";
    }

    // Constructor for Triangle.  
    Triangle10(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // One argument constructor 
    Triangle10(double x) {
        super(x, "triangle"); // call superclass constructor  

        style = "filled";
    }

    // Construct an object from an object.  
    Triangle10(Triangle10 ob) {
        super(ob); // pass object to TwoDShape constructor  
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
