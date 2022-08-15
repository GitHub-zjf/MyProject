package s0021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// ĳһ��Ϊ�գ�ֱ�ӷ�����һ��
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		// ת����list
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

		// �ϲ�����list
		List<Integer> resultList = new ArrayList<>();
		resultList.addAll(list1);
		resultList.addAll(list2);

		// ת��Ϊ���飬������
		Object[] objs = resultList.toArray();
		Arrays.sort(objs);

		// ������
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