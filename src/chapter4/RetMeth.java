package chapter4;

class RetMeth {

    public static void main(String[] args) {
        Veicolo3 minivan = new Veicolo3();
        Veicolo3 sportscar = new Veicolo3();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers
                + " with range of " + range1 + " Miles");
        System.out.println("Sportscar can carry " + sportscar.passengers
                + " with range of " + range2 + " miles");

    }
}
