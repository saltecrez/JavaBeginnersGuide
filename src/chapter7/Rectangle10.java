package chapter7;

class Rectangle10 extends TwoDShape10 {
    // A default constructor.  

    Rectangle10() {
        super();
    }

    // Constructor for Rectangle.  
    Rectangle10(double w, double h) {
        super(w, h, "rectangle"); // call superclass constructor  
    }

    // Construct a square.  
    Rectangle10(double x) {
        super(x, "rectangle"); // call superclass constructor  
    }

    // Construct an object from an object.  
    Rectangle10(Rectangle10 ob) {
        super(ob); // pass object to TwoDShape constructor  
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) {
            return true;
        }
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
