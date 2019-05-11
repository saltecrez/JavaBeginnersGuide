package chapter11;

class MyThread7 implements Runnable {

    Thread thrd;
    static SumArray2 sa = new SumArray2();
    int a[];
    int answer;

    // Construct a new thread.  
    MyThread7(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); // start the thread  
    }

    // Begin execution of new thread.  
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        // synchronize calls to sumArray()  
        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName()
                + " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}
