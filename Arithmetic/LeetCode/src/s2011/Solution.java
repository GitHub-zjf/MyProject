package s2011;

/**
 *  2011. ִ�в�����ı���ֵ
 */
class Solution {
    public int finalValueAfterOperations(String[] operations) {
    	int ret = 0;
    	for(String operation:operations){
    		if(operation.contains("+")){
    			ret++;
    		}else {
				ret--;
			}
    	}
    	return ret;
    }
}