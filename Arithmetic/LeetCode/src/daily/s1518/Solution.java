package daily.s1518;
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    	int result = numBottles;
    	// 剩下的空瓶数量
    	int nullBottle = numBottles;
    	// 剩下的空瓶子大于等于可以更换的数量时，继续计算
    	while (nullBottle >= numExchange) {
    		// 可以换多少瓶酒
    		int tempRet = nullBottle / numExchange;
    		// 剩下的空瓶空瓶数量
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