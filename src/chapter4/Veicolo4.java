package chapter4;

class Veicolo4 {

    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}
