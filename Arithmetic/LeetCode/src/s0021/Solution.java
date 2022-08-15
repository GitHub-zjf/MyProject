package s0021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// 某一个为空，直接返回另一个
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		// 转换成list
		List<Integer> list1 = new ArrayList<>();
		while (l1 != null) {
			list1.add(l1.val);
			l1 = l1.next;
		}
		List<Integer> list2 = new ArrayList<>();
		while (l2 != null) {
			list2.add(l2.val);
			l2 = l2.next;
		}

		// 合并两个list
		List<Integer> resultList = new ArrayList<>();
		resultList.addAll(list1);
		resultList.addAll(list2);

		// 转换为数组，并排序
		Object[] objs = resultList.toArray();
		Arrays.sort(objs);

		// 构造结果
		ListNode result = null;
		ListNode tarlNode = null;
		for (Object obj:objs) {
			ListNode temp = new ListNode((int) obj);
			if(result == null){
				result = tarlNode = temp;
			}else{
				tarlNode.next = temp;
				tarlNode = temp;
			}
		}
		return result;
	}
}