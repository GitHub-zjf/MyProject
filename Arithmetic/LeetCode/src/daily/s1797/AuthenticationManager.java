package daily.s1797;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  1797. 设计一个验证系统
 */
class AuthenticationManager {

    int timeToLive = 0;
    Map<String, Integer> map = new HashMap<>();

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        Integer time = map.get(tokenId);
        if (time == null) {
            return;
        }
        if (time > currentTime) {
            map.put(tokenId, currentTime + timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        Set<String> keySet = map.keySet();
        for (String tokenId : keySet) {
            if (map.get(tokenId) > currentTime) {
                count++;
            }
        }
        return count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */