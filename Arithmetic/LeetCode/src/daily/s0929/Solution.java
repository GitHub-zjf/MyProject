package daily.s0929;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		for (String email : emails) {
			String[] es = email.split("@");
			String localName = es[0].replace(".", "");
			if (localName.indexOf("+") != -1) {
				localName = localName.substring(0, localName.indexOf("+"));
			}
			set.add(localName + "@" + es[1]);
		}
		return set.size();
	}

	public static void main(String[] args) {
		String[] emails = new String[] { "test.email+alex@leetcode.com", "test.email.leet+alex@code.com" };
		System.out.println(new Solution().numUniqueEmails(emails));
	}
}