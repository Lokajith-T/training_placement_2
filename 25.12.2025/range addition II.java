class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (var op: ops) {
            if (op[0] < m) m = op[0];
            if (op[1] < n) n = op[1];
        }
        return m * n;
    }
}
