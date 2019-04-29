package chapter7;

abstract class TwoDShape10 {

    private double width;
    private double height;
    private String name;

    // A default constructor.  
    TwoDShape10() {
        width = height = 0.0;
        name = "none";
    }

    // Parameterized constructor.  
    TwoDShape10(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct object with equal width and height.  
    TwoDShape10(double x, String n) {
        width = height = x;
        name = n;
    }

    // Construct an object from an object.  
    TwoDShape10(TwoDShape10 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height.  
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are "
                + width + " and " + height);
    }

    // Now, area() is abstract. 
    abstract double area();
}
