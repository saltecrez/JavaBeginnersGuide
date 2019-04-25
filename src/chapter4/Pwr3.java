package chapter4;
//this is the real useful usage of this. Local variables have same name as instance variables.
class Pwr3 {

    double b;
    int e;
    double val;

    Pwr3(double b, int e) {
        this.b = b;
        this.e = e;

        val = 1;
        if (e == 0) {
            return;
        }
        for (; e > 0; e--) {
            val = val * b;
        }
    }
}
