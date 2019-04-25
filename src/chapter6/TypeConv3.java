package chapter6;

class TypeConv3 {

    public static void main(String[] args) {
        Overload3 ob = new Overload3();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // calls ob.f(int) 
        ob.f(d); // calls ob.f(double) 

        ob.f(b); // calls ob.f(byte) -- now, no type conversion 

        ob.f(s); // calls ob.f(int) -- type conversion 
        ob.f(f); // calls ob.f(double) -- type conversion 
    }
}
