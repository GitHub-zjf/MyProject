package s0541;

public class Solution {
	public String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		int len = chars.length;
		int left = 0;
		int right = left + k - 1;
		int i = 0;
		while ((left + 2 * k) < len) {
			i++;
			while (left < right) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;

				left++;
				right--;
			}
			left = i * k * 2;
			right = left + k - 1;
		}
		// ´¦ÀíÊ£ÓàµÄ×Ö·û
		int odd = len - left;
		if (odd > 0 && odd < k) {
			right = len - 1;
		} else if (odd >= k && odd < 2 * k) {
			right = left + k - 1;
		}
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

			left++;
			right--;
		}
		return String.valueOf(chars);
	}

	public static void main(String[] args) {
		String s = "abcd";
		int k = 2;
		System.out.println(new Solution().reverseStr(s, k));
		System.out.println("abcdefgfdswfdvdvf".length());
	}
}