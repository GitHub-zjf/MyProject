package s0917;

class Solution {
	public String reverseOnlyLetters(String s) {
		char[] cArray = s.toCharArray();
		int left = 0;
		int right = cArray.length - 1;
		boolean leftIsLetter;
		boolean rightIsLetter;
		while (left < right) {
			leftIsLetter = rightIsLetter = false;
			char l = cArray[left];
			char r = cArray[right];
			if ((65 <= l && l <= 90) || (97 <= l && l <= 122)) {
				leftIsLetter = true;
			}
			if ((65 <= r && r <= 90) || (97 <= r && r <= 122)) {
				rightIsLetter = true;
			}
			if (leftIsLetter && rightIsLetter) {
				char temp = cArray[left];
				cArray[left] = cArray[right];
				cArray[right] = temp;
				left++;
				right--;
			} else {
				if (!leftIsLetter) {
					left++;
				}
				if (!rightIsLetter) {
					right--;
				}
			}
		}
		return new String(cArray);
	}

	public static void main(String[] args) {
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(new Solution().reverseOnlyLetters(s));
	}
}