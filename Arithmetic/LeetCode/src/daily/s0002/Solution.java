package daily.s0002;
/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 如果某一个链表为空，直接返回另一个链表
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		// 结果链表
		ListNode result = null;
		ListNode tarlNode = null;
		// 记录余数
		int rem = 0;
		// 先计算两个链表的相同长度前几位数
		while (l1 != null && l2 != null) {
			int r = (l1.val + l2.val + rem) % 10;
			ListNode listNode = new ListNode(r);
			rem = (l1.val + l2.val + rem) / 10;
			// 采用尾插法
			if (result == null) {
				result = tarlNode = listNode;
				l1 = l1.next;
				l2 = l2.next;
			} else {
				tarlNode.next = listNode;
				tarlNode = listNode;
				l1 = l1.next;
				l2 = l2.next;
			}
		}
		// 处理高位
		while (l1 != null) {
			int r = (l1.val + rem) % 10;
			ListNode listNode = new ListNode(r);
			rem = (l1.val + rem) / 10;
			tarlNode.next = listNode;
			tarlNode = listNode;
			l1 = l1.next;
		}
		while (l2 != null) {
			int r = (l2.val + rem) % 10;
			ListNode listNode = new ListNode(r);
			rem = (l2.val + rem) / 10;
			tarlNode.next = listNode;
			tarlNode = listNode;
			l2 = l2.next;
		}
		// 处理最后一位结果
		if (rem != 0) {
			ListNode listNode = new ListNode(1);
			tarlNode.next = listNode;
			tarlNode = listNode;
		}
		return result;
	}
}
