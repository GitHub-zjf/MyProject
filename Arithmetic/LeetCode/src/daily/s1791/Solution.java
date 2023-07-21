package daily.s1791;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findCenter(int[][] edges) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int[] edge:edges){
    		map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
    		map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
    	}
    	int n = edges.length;
    	for(Integer key : map.keySet()){
    		if(map.get(key) == n){
    			return key;
    		}
    	}
    	return 0;
    }
    
    public int findCenter2(int[][] edges) {
    	return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
    
    public static void main(String[] args) {
		int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
    	System.out.println(new Solution().findCenter(edges));
	}
}