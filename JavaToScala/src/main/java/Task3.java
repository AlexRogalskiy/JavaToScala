import java.io.*;
import java.math.BigDecimal;
import java.util.*;

class PolynomItem {
    char sign;
    int coef;
    int pow;

    public PolynomItem(char sign, int coef, int pow) {
        this.sign = sign;
        this.coef = coef;
        this.pow = pow;
    }
}

public class Task3 {
    private static PolynomItem parse(String st) {
        String[] splitted1 = getSplit(st);


        return null;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Map<Integer, List<PolynomItem>> map = new HashMap<>();

//        String s1 = in.nextLine();
//        String s2 = in.nextLine();

        String s1 = "x+2";
        String s2 = "-x^31-555x^22+555x-88";


        String[] splitted1 = getSplit(s1);
        String[] splitted2 = getSplit(s2);
        String result = "";
        System.out.println(s2);

        for (String split1 : splitted2) {
            System.out.println("");
            System.out.println(split1);
            String sign = "+";
            int power = 0;
            String koef = "1";

            int signPos = split1.indexOf('-');
            if (signPos >= 0) sign = "-";


            int xPos = split1.indexOf('x');
            if (signPos >= 0) {
                if (xPos >= 0) {
                    koef = split1.substring(1, xPos);
                } else {
                    koef = split1.substring(1);
                }
            } else {
                if (xPos >= 0) {
                    koef = split1.substring(0, xPos);
                } else {
                    koef = split1.substring(1);
                }
            }

            if(koef.equals("")) koef = "1";

            int powPos = split1.indexOf('^');

            if (powPos >= 1) {
                if (xPos >= 0) {
                    if (split1.length() > 1) {
                        String powerSt = xPos + 4 <= split1.length() ?
                                split1.substring(xPos + 2, xPos + 4) :
                                split1.substring(xPos + 2, xPos + 3);

                        if (isDigit(powerSt)) {
                            power = Integer.valueOf(powerSt);
                        } else {
                            power = Integer.valueOf(powerSt.substring(0, 1));
                        }
                    } else {
                        power = 1;
                    }
                }
            } else {

                if(signPos >= 0) koef = koef.substring(1);

            }

            System.out.println("Power is " + power);
            System.out.println("Koef is " + koef);
            System.out.println("Sign is " + sign);

//            PolynomItem pol = new PolynomItem(sign, koef, power);


        }

//        out.println(s1);
        out.flush();
    }

    private static String multiply2(String split1, String split2, char sign1, char sign2) {
        System.out.println(split1 + " " + split2);
        if (isDigit(split1) && isDigit(split2)) {
            BigDecimal multiplyResult = new BigDecimal(split1).multiply(new BigDecimal(split2));
            return String.valueOf(getSign(sign1, sign2)) + String.valueOf(multiplyResult);
        }

        return split1;
    }

    private static char getSign(char sign1, char sign2) {
        if (((sign1 == '+') && (sign2 == '-'))
                || (sign1 == '-') && (sign2 == '+')) {
            return '-';
        }
        return '+';
    }

    private static boolean isDigit(String split1) {
        try {
            new BigDecimal(split1);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    private static String[] getSplit(String toSplit) {
//        return toSplit.split("[-+]");
        return toSplit.split("(?=[-+])");
    }
}