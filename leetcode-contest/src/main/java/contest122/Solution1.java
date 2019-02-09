package contest122;

import java.util.Arrays;

public class Solution1 {


    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        final int[] result = new int[A.length];

        for (int i = 0; i < queries.length; i++) {
            A[queries[i][1]] += queries[i][0];

            result[i] = Arrays.stream(A).filter(a -> a % 2 == 0).sum();
        }

        return result;
    }


    public static void main(String[] args) {
        final int[] A = {1, 2, 3, 4};
        final int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        Solution1 solution = new Solution1();

        Arrays.stream(solution.sumEvenAfterQueries(A, queries)).forEach(System.out::println);
    }
}
