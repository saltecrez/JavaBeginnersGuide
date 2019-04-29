package chapter7;

class Rectangle9 extends TwoDShape9 {
    // A default constructor.  

    Rectangle9() {
        super();
    }

    // Constructor for Rectangle.  
    Rectangle9(double w, double h) {
        super(w, h, "rectangle"); // call superclass constructor  
    }

    // Construct a square.  
    Rectangle9(double x) {
        super(x, "rectangle"); // call superclass constructor  
    }

    // Construct an object from an object.  
    Rectangle9(Rectangle9 ob) {
        super(ob); // pass object to TwoDShape constructor  
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) {
            return true;
        }
        return false;
    }

    // Override area() for Rectangle. 
    double area() {
        return getWidth() * getHeight();
    }
}
