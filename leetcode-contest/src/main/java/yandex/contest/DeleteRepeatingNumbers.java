package yandex.contest;

import java.io.*;
import java.util.*;

public class DeleteRepeatingNumbers {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(
                new FileInputStream("input.txt"), "UTF-8")) {
            int n = sc.nextInt();
            int prevInt = 0;

            if (n != 0) {
                prevInt = sc.nextInt();
                sb.append(String.valueOf(prevInt));
            }
            for (int i = 0; i < n - 1; i++) {
                int next = sc.nextInt();
                if (next != prevInt) {
                    sb.append(System.getProperty("line.separator"));
                    sb.append(String.valueOf(next));
                    prevInt = next;
                }
            }
        }

        System.gc();

        try(FileWriter writer = new FileWriter("output.txt",true)) {
            writer.append(sb);
        }

    }
}