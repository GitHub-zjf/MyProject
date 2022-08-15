package s1342;

/**
 * 	����һ���Ǹ����� num �����㷵�ؽ������ 0 ����Ҫ�Ĳ����� �����ǰ������ż��������Ҫ�������� 2 �����򣬼�ȥ 1 ��
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