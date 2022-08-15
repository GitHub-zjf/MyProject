package s0667;

import java.util.HashMap;
import java.util.Map;

class MapSum {

	Map<String, Integer> map;
	int count = 0;
	
    public MapSum() {
    	map = new HashMap<String, Integer>();
    }
    
    public void insert(String key, int val) {
    	map.put(key, val);
    }
    
    public int sum(String prefix) {
    	count = 0;
    	map.forEach((k, v) -> {
    		if(k.startsWith(prefix)){
    			count += v;
    		}
    	});
        return count;
    }
    
    public static void main(String[] args) {
    	System.out.println("aab".startsWith("ab"));
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */