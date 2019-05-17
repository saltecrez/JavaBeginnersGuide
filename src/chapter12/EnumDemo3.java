package chapter12;

class EnumDemo3 {

    public static void main(String args[]) {
        Transport2 tp;

        // Display speed of an airplane.  
        System.out.println("Typical speed for an airplane is "
                + Transport2.AIRPLANE.getSpeed()
                + " miles per hour.\n");

        // Display all Transports and speeds.  
        System.out.println("All Transport speeds: ");
        for (Transport2 t : Transport2.values()) {
            System.out.println(t + " typical speed is "
                    + t.getSpeed()
                    + " miles per hour.");
        }
    }
}
