import java.io.PrintWriter;
import java.util.*;

public class Task1 {

    public static boolean isPalindrom(int n) {
        final String a = String.valueOf(n);
        final String b = new StringBuilder(a).reverse().toString();

        return a.equals(b);
    }

    public static int getPalQnt(int n) {
        if (n < 10) return n;

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isPalindrom(i)) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        out.println(getPalQnt(a));

        out.flush();
    }
}