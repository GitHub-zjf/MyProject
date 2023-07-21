package daily.s0876;

public class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode[] listNodes = new ListNode[100];
		int count = 0;
		while (head != null) {
			listNodes[count] = head;
			count++;
			head = head.next;
		}
		return listNodes[count / 2];
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}