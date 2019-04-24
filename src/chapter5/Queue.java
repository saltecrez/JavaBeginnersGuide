package chapter5;

class Queue {

    char q[];
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //put a character into the queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("- Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    //get a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println("- Queue is empty");
            return (char) 0;
        }

        return q[getloc++];
    }
}
