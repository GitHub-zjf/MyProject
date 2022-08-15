package s2047;

class Solution {
	public int countValidWords(String sentence) {
		int count = 0;

		String[] split = sentence.split(" {1,}");

		for (String s : split) {
			if (s.matches("[0,9]{1,}")) {
				continue;
			}
		}

		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("ssss1".matches("^-?[0-9]d*$"));
	}
}