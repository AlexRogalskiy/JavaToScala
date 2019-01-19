import java.io.*;
import java.util.*;

public class Task2 {

    private static boolean isMoreThanOneCharInString(String st, char ch){
        long count = st.chars().filter(c -> c == ch).count();

        return count > 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.nextLine().toLowerCase();

        StringBuilder result = new StringBuilder();

        for (char ch = 'a'; ch <= 'z'; ch++){
            if(isMoreThanOneCharInString(s, ch)) result.append(ch);
        }
        out.println(result);
        out.flush();
    }
}

