package chapter4;

class AddMeth {

    public static void main(String[] args) {
        Veicolo2 minivan = new Veicolo2();
        Veicolo2 sportscar = new Veicolo2();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();
        System.out.println("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();
    }
}
