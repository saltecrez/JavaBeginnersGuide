package chapter8.bookpackext;

class UseBook2 {

    public static void main(String args[]) {
        chapter8.bookpack.Book2 books[] = new chapter8.bookpack.Book2[5];

        books[0] = new chapter8.bookpack.Book2("Java: A Beginner's Guide",
                "Schildt", 2014);
        books[1] = new chapter8.bookpack.Book2("Java: The Complete Reference",
                "Schildt", 2014);
        books[2] = new chapter8.bookpack.Book2("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new chapter8.bookpack.Book2("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new chapter8.bookpack.Book2("On the Road",
                "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
