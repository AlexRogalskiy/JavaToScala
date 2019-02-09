package contest122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}


class Solution {

    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        List<Interval> list = new ArrayList<>();

        for (Interval intervalA : A) {
            for (Interval intervalB : B) {
                if (intervalB.start >= intervalA.start && intervalB.start <= intervalA.end)
                    if (intervalB.end <= intervalA.end)
                        list.add(new Interval(intervalB.start, intervalB.end));
                    else
                        list.add(new Interval(intervalB.start, intervalA.end));
                else if (intervalB.end >= intervalA.start && intervalB.end <= intervalA.end)
                    if (intervalB.start <= intervalA.start)
                        list.add(new Interval(intervalA.start, intervalB.end));
                    else
                        list.add(new Interval(intervalB.start, intervalB.end));
                else if (intervalB.start <= intervalA.start && intervalB.end >= intervalA.end)
                    list.add(new Interval(intervalA.start, intervalA.end));
            }
        }

        return list.toArray(new Interval[0]);
    }


    public static void main(String[] args) {
        Interval[] A = {new Interval(4, 6),
                new Interval(7, 8),
                new Interval(10, 17)};
        Interval[] B = {new Interval(5, 10)};

        Solution solution = new Solution();

        Arrays.stream(solution.intervalIntersection(A, B))
                .map(item -> "Start: " + item.start + " End: " + item.end)
                .forEach(System.out::println);
    }
}