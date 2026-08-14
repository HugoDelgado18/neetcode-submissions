class Solution {
    public int[][] merge(int[][] intervals) {
        // sort the intervals by starting points
        // array.sort() that'll keep it at O(n) one time cost.
        // for loop if 1st interval end point is greater or equal to the next interval start point we have an overlap.
        List<int[]> nonOverlapping = new ArrayList<>();
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

int startIn = intervals[0][0];
int endIn = intervals[0][1];

for (int i = 1; i < intervals.length; i++) {

    if (endIn >= intervals[i][0]) {
        // overlap
        endIn = Math.max(endIn, intervals[i][1]);
    } else {
        // no overlap
        nonOverlapping.add(new int[]{startIn, endIn});

        startIn = intervals[i][0];
        endIn = intervals[i][1];
    }
}

nonOverlapping.add(new int[]{startIn, endIn});

        return nonOverlapping.toArray(new int[nonOverlapping.size()][]);


    }
}
