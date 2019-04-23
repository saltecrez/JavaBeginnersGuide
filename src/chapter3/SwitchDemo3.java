package chapter3;

class SwitchDemo3 {

    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
                   
            switch (i) {

                case 1:
                case 2:
                case 3:
                    System.out.println("i is 1,2 or 3");
                    break;
                case 4:

                    System.out.println("i is 4");

                    break;
            }
        }
    }
}
