class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int n = points.length;
        Deque<int[]> deque = new LinkedList<>();
        int maxVal = Integer.MIN_VALUE;

        for (int[] point : points) {
            while (!deque.isEmpty() && point[0] - deque.peekFirst()[0] > k) {
                deque.pollFirst();
            }
            if (!deque.isEmpty()) {
                int[] prev = deque.peekFirst();
                int curVal = point[1] + prev[1] + point[0] - prev[0];
                maxVal = Math.max(maxVal, curVal);
            }
            while (!deque.isEmpty() && deque.peekLast()[1] - deque.peekLast()[0] < point[1] - point[0]) {
                deque.pollLast();
            }
            deque.offerLast(point);
        }

        return maxVal;
    }
}
