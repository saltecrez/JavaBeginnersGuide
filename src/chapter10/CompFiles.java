package chapter10;

/*
   Try This 10-1

   Compare two files.

   To use this program, specify the names
   of the files to be compared on the command line.

   java CompFile FIRST.TXT SECOND.TXT

   This code requires JDK 7 or later.
 */

import java.io.*;

class CompFiles {

    public static void main(String args[]) {
        int i = 0, j = 0;
        String s="/home/londero/TEST.TXT";
        String t="/home/londero/TEST2.TXT";

        // First make sure that both files have been specified.
        if (args.length != 0) {
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }

        // Compare the files.
        try (FileInputStream f1 = new FileInputStream(s);
                FileInputStream f2 = new FileInputStream(t)) {
            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) {
                    break;
                }
            } while (i != -1 && j != -1);

            if (i != j) {
                System.out.println("Files differ.");
            } else {
                System.out.println("Files are the same.");
            }
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
