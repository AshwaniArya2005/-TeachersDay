import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem1 {

    //Q) Merge Intervals
    //Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] newInt = intervals[0];
        result.add(newInt);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= newInt[1]) {
                newInt[1] = Math.max(newInt[1], intervals[i][1]);
            } else {
                newInt = intervals[i];
                result.add(newInt);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
