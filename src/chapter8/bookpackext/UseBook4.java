// Demonstrate import. 
package chapter8.bookpackext;

import chapter8.bookpack.*;

// Use the Book Class from bookpack.  
class UseBook4 {

    public static void main(String args[]) {
        Book4 books[] = new Book4[5];

        books[0] = new Book4("Java: A Beginner's Guide",
                "Schildt", 2014);
        books[1] = new Book4("Java: The Complete Reference",
                "Schildt", 2014);
        books[2] = new Book4("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new Book4("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Book4("On the Road",
                "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
