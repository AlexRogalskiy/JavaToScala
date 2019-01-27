package contest121;

public class StrWithout3a3b {


    public static String strWithout3a3b(int A, int B) {
        StringBuilder result = new StringBuilder(A + B);

        Integer countA = 0;
        Integer countB = 0;
        while (A + B > 0) {
            if (A > B) {
                result.append('a');
                countA++;
                A--;
                if (countA == 2 && A + B > 0) {
                    result.append('b');
                    countA = 0;
                    B--;
                }
            } else {
                result.append('b');
                countB++;
                B--;
                if (countB == 2 && A + B > 0) {
                    result.append('a');
                    countB = 0;
                    A--;
                }
            }
        }


        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(strWithout3a3b(3, 3));
    }
}
