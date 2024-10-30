class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) return new int[0][0];

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        int[] currentInterval = intervals[0];
        res.add(currentInterval);

        for (int i = 1; i < n; i++) {
            int[] interval = intervals[i];

            if (currentInterval[1] >= interval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                currentInterval = interval;
                res.add(currentInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}