package daily.s0019;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		int length = getLength(head);
		ListNode cur = dummy;
		for (int i = 1; i < length - n + 1; ++i) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		ListNode ans = dummy.next;
		return ans;

	}

	public int getLength(ListNode head) {
		int length = 0;
		while (head != null) {
			++length;
			head = head.next;
		}
		return length;
	}

	public static void main(String[] args) {
		ListNode listNode5 = new ListNode(5);
		ListNode listNode4 = new ListNode(4, listNode5);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		new Solution().removeNthFromEnd(listNode1, 2);
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