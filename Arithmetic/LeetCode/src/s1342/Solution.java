package s1342;

/**
 * 	给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * @author zheng
 *
 */
class Solution {
    public int numberOfSteps (int num) {
    	int time = 0;
    	while(num != 0){
    		time++;
    		if(num%2==0){
    			num /= 2;
    		}else{
    			num -= 1;
    		}
    	}
    	return time;
    }
    
    public static void main(String[] args) {
    	for(int i=1;i<=16;i++){
    		System.out.print(new Solution().numberOfSteps(i) + "  ");
    	}
		
	}
}