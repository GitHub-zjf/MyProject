package s2011;

/**
 *  2011. 执行操作后的变量值
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