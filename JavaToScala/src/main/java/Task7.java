import java.io.*;
import java.util.*;

public class Task7 {
    private static int calculate(int x, int y) {
        //y = x*4^a + b*3
        //min(a+b)
        int a = calculateA(x, y, 1, 0);
        int b = calculateB(x, y, a);
        if (y - (x * Math.pow(4, a)) - (b * 3) == 0) {
            return a + b;
        } else {
            return -1;
        }
    }

    private static int calculateA(int x, int y, int a, int b) {
        int remainder = y - (b * 3);
        if (remainder < (x * Math.pow(4, a)) || remainder / (x * Math.pow(4, a)) < 1) {
            return 0;
        }
        if (remainder % (x * Math.pow(4, a)) == 0) {
            return getBiggestA(remainder, x, a);
        } else {
            return calculateA(x, y, a, b + 1);
        }
    }

    private static int getBiggestA(int rem, int x, int a) {
        int result = rem / (int) (x * Math.pow(4, a));
        if (result / 4 > 0) {
            return getBiggestA(rem, x, a + 1);
        }
        return a;
    }

    private static int calculateB(int x, int y, int a) {
        int rem = y - (x * (int) Math.pow(4, a));
        if (rem <= 0) {
            return 0;
        } else {
            return rem / 3;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();

        out.print(calculate(x, y));

        out.flush();
    }

}