package chapter7;

class TwoDShape3 {

    private double width;  // these are 
    private double height; // now private  

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

    void showDim() {
        System.out.println("Width and height are "
                + width + " and " + height);
    }
}
