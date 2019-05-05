package chapter10;

/* A version of CopyFile that uses try-with-resources.
   It demonstrates two resources (in this case files) being
   managed by a single try statement.

   Note: This code requires JDK 7 or later.
 */

import java.io.*;

class CopyFile3 {

    public static void main(String args[]) throws IOException {
        int i;
        String s="/home/londero/TEST.TXT";
        String t="/home/londero/TEST2.TXT";

        // First, confirm that both files has been specified.
        if (args.length != 0) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream(s);
                FileOutputStream fout = new FileOutputStream(t)) {

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
