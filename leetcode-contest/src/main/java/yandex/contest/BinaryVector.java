package yandex.contest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BinaryVector {

    public static int countMaxSeq(String input) {

        return Arrays
                .stream(input
                        .split("0"))
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    public static void main(String[] args) throws IOException {
        StringBuilder strings = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get("input.txt"))) {
            stream.forEach(strings::append);
        }

        int output = countMaxSeq(strings.substring(1));
        System.out.println(output);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("output.txt"), "utf-8"))) {
            writer.write(String.valueOf(output));
        }
    }
}
