package contest120;

import java.util.Arrays;

public class SquaresSortedArray {


    public static int[] sortedSquares(int[] A) {
        return Arrays.stream(A).boxed().mapToInt(x -> x*x).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] A1 = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(A1));
        int[] ints = sortedSquares(A1);

        System.out.println(Arrays.toString(ints));

    }


}
