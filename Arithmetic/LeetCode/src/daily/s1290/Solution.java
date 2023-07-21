package daily.s1290;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue1(ListNode head) {
    	String binaryNum = head.val + "";
    	while(null != head.next){
    		head = head.next;
    		binaryNum += head.val;
    	}
    	return Integer.valueOf(binaryNum, 2);
    }
    
    public int getDecimalValue2(ListNode head) {
    	int res = 0;
        while(head != null){
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }
    
    public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(0);
		ListNode three = new ListNode(1);
		one.next = two;
		two.next = three;
		System.out.println(new Solution().getDecimalValue2(one));
	}
} 

 