package s1725;

class Solution {
	public int countGoodRectangles(int[][] rectangles) {
		int maxLength = 0;
		int[] r = new int[rectangles.length];
		for (int i = 0; i < rectangles.length; i++) {
			r[i] = Math.min(rectangles[i][0], rectangles[i][1]);
			maxLength = Math.max(maxLength, r[i]);
		}
		int count = 0;
		for (int i : r) {
			if (maxLength == i) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] rectangles = new int[][] { { 2, 3 }, { 3, 7 }, { 4, 3 }, { 3, 7 } };
		System.out.println(new Solution().countGoodRectangles(rectangles));
	}
}