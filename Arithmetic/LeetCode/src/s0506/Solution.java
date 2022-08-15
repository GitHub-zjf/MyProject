package s0506;

class Solution {
	public String[] findRelativeRanks(int[] score) {
		int len = score.length;
		String[] result = new String[len];
		int rank = 1;
		for (int i = 0; i < len; i++) {
			int maxScore = -1;
			int temp = 0;
			for (int j = 0; j < len; j++) {
				if (score[j] > maxScore) {
					maxScore = score[j];
					temp = j;
				}
			}
			switch (rank) {
			case 1:
				result[temp] = "Gold Medal";
				break;
			case 2:
				result[temp] = "Silver Medal";
				break;
			case 3:
				result[temp] = "Bronze Medal";
				break;
			default:
				result[temp] = String.valueOf(rank);
				break;
			}
			score[temp] = -1;
			rank++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] score = new int[] { 10, 3, 8, 9, 4 };
		String[] findRelativeRanks = new Solution().findRelativeRanks(score);
		for (String str : findRelativeRanks) {
			System.out.print(str + ",");
		}
	}
}