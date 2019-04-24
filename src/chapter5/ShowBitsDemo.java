package chapter5;

class ShowBitsDemo {

    public static void main(String[] args) {
        ShowBits2 b = new ShowBits2(8);
        ShowBits2 i = new ShowBits2(32);
        ShowBits2 li = new ShowBits2(64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary: ");
        li.show(237658768);

        // you can also show low-order bits of any integer 
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
