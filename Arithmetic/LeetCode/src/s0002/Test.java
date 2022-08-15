package s0002;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ListNode l1 = null;
		ListNode l2 = null;
		for (int i = 1; i <= 2; i++) {
			System.out.print("请输入第" + i + "个链表:");
			Scanner scanner = new Scanner(System.in);
			ListNode headListNode = null;
			while (scanner.hasNextInt()) {
				int x = scanner.nextInt();
				if (x == -1) break;
				ListNode listNode = new ListNode(x);
				if (headListNode == null) {
					headListNode = listNode;
				} else {
					listNode.next = headListNode;
					headListNode = listNode;
				}
			}
			scanner.close();
			if (i == 1) l1 = headListNode;
			if (i == 2) l2 = headListNode;
		}

		Solution solution = new Solution();
		ListNode result = solution.addTwoNumbers(l1,l2);
		while (result != null) {
			System.out.print(result.val);
			result = result.next;
		}
	}
}
