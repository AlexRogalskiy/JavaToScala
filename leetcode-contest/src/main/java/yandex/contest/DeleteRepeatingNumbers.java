package yandex.contest;

import java.io.*;
import java.util.*;

public class DeleteRepeatingNumbers {
    public static long copyLarge(InputStream input, OutputStream output)
            throws IOException {
        byte[] buffer = new byte[20_000_000];
        long count = 0;
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        try (InputStream input = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")){
            copyLarge(input, out);
        }


//        StringBuilder sb = new StringBuilder();
//        try (Scanner sc = new Scanner(
//                new FileInputStream("input.txt"), "UTF-8")) {
//            int n = sc.nextInt();
//            int prevInt = 0;
//
//            if (n != 0) {
//                prevInt = sc.nextInt();
//                sb.append(String.valueOf(prevInt));
//            }
//            for (int i = 0; i < n - 1; i++) {
//                int next = sc.nextInt();
//                if (next != prevInt) {
//                    sb.append(System.getProperty("line.separator"));
//                    sb.append(String.valueOf(next));
//                    prevInt = next;
//                }
//            }
//        }


    }
}