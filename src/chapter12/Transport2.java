package chapter12;

// Use an enum constructor, instance variable, and method.  
enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // typical speed of each transport   

    // Constructor  
    Transport2(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}
