package daily.s0274;

class Solution {
	public int hIndex(int[] citations) {
		int len = citations.length;
		int left = 0;
		int right = len;
		while (left < right) {
			// ������ƪ��
			int mid = (left + right + 1) / 2;
			// ��������õ��ص��ǣ����ô��� >= ����ƪ��
			// count �ĺ����ǣ����ڵ��� mid ������ƪ��
			int count = 0;
			for (int citation : citations) {
				if (citation >= mid) {
					count++;
				}
			}

			if (count >= mid) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] citations = new int[] { 3, 0, 6, 1, 5 };
		System.out.println(new Solution().hIndex(citations));
	}
}