package daily.s1518;
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    	int result = numBottles;
    	// ʣ�µĿ�ƿ����
    	int nullBottle = numBottles;
    	// ʣ�µĿ�ƿ�Ӵ��ڵ��ڿ��Ը���������ʱ����������
    	while (nullBottle >= numExchange) {
    		// ���Ի�����ƿ��
    		int tempRet = nullBottle / numExchange;
    		// ʣ�µĿ�ƿ��ƿ����
    		int tempNullBottle = nullBottle - (numExchange * tempRet);
    		nullBottle = tempRet + tempNullBottle;
    		result += tempRet;
		}
    	return result;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().numWaterBottles(2, 3));
	}
}