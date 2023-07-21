package daily.s0374;
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution {
	int pick;
	
    public int guessNumber(int n) {
    	int left = 1;
        int right = n;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            int result = guess(mid);
            if(result == 0){
                return mid;
            }
            if(result == -1){
                right = mid - 1;
            }
            if(result == 1){
                left = mid + 1;
            }
        }
        return -1;
    }
    
    public int guess(int num){
    	if(num == pick) return 0;
    	return pick > num ? 1 : -1;
    }
    
    public static void main(String[] args) {
		Solution solution = new Solution();
		solution.pick = 2;
		System.out.println(solution.guessNumber(2));
	}
}