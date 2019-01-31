package yandex.contest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stone {

    public static int getAmount(String J, String S) {
        int result = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println();
            if (J.indexOf(ch) >= 0)
                for (int j = 0; j < S.length(); j++)
                    if (ch == S.charAt(j)) result++;
        }

        return result;

    }

    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get("input.txt"))) {
            stream.forEach(e -> strings.add(new String(e)));
        }

        getAmount(strings.get(0), strings.get(1));

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("output.txt"), "utf-8"))) {
            writer.write(String.valueOf(getAmount(strings.get(0), strings.get(1))));
        }
    }
}
