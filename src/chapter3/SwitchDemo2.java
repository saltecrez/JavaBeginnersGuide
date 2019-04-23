package chapter3;
//dimostra inner outer switch

class SwitchDemo2 {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'B';

        switch (ch1) {
            case 'A':
                System.out.println("This A is part of outer switch.");
                switch (ch2) {
                    case 'A':
                        System.out.println("This A is part of inner switch");
                        break;
                    case 'B':
                        System.out.println("This B is part of inner switch");
                        break;
                } // end of inner switch 
                break;
            case 'B': 
                System.out.println("This B is part of outer switch.");
                break;
        }
    }
}
