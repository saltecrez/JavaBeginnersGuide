package chapter8.bookpackext;

class ProtectDemo3 {

    public static void main(String args[]) {
        ExtBook3 books[] = new ExtBook3[5];

        books[0] = new ExtBook3("Java: A Beginner's Guide",
                "Schildt", 2014, "McGraw-Hill");
        books[1] = new ExtBook3("Java: The Complete Reference",
                "Schildt", 2014, "McGraw-Hill");
        books[2] = new ExtBook3("The Art of Java",
                "Schildt and Holmes", 2003,
                "McGraw-Hill");
        books[3] = new ExtBook3("Red Storm Rising",
                "Clancy", 1986, "Putnam");
        books[4] = new ExtBook3("On the Road",
                "Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

        // Find books by author 
        System.out.println("Showing all books by Schildt.");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Schildt") {
                System.out.println(books[i].getTitle());
            }
        }

//    books[0].title = "test title"; // Error -- not accessible  
    }
}
