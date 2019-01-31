package yandex.contest;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteRepeatingNumbers {


    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(
                new FileInputStream("input.txt"), "UTF-8");
             Writer writer = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream("output.txt"), "utf-8"))) {
            int n = sc.nextInt();
            int prevInt = 0;

            if (n != 0) {
                prevInt = sc.nextInt();
                writer.write(String.valueOf(prevInt));
            }
            for (int i = 0; i < n - 1; i++) {
                int next = sc.nextInt();
                if (next != prevInt) {
                    writer.write(System.getProperty("line.separator"));
                    writer.write(String.valueOf(next));
                    prevInt = next;
                }
            }
        }
    }
}