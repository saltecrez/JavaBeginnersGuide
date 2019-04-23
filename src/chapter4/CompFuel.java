package chapter4;

class CompFuel {

    public static void main(String[] args) {

        Veicolo4 minivan = new Veicolo4();
        Veicolo4 sportscar = new Veicolo4();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs "
                + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs "
                + gallons + " gallons of fuel.");
    }
}
