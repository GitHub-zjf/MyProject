package s1684;

class Solution {
	public int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		for (String word : words) {
			boolean isAdd = true;
			String[] split = word.split("");
			for (String s : split) {
				if(!allowed.contains(s)){
					isAdd = false;
					break;
				}
			}
			if(isAdd){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

	}
}