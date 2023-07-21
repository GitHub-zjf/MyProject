package daily.s0423;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

	public static Map<String, String> map = new HashMap<String, String>();

	static {
		map.put("0", "zero");
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");
		map.put("6", "six");
		map.put("7", "seven");
		map.put("8", "eight");
		map.put("9", "nine");
	}

	/**
	 * 超时垃圾代码
	 * 
	 * @param s
	 * @return
	 */
	public String originalDigits_timeout(String s) {
		List<Integer> list = new ArrayList<Integer>();
		// 排除0(z),2(w),4(u),6(x),8(g)
		while (s.contains("z")) {
			s = s.replaceFirst("z", "").replaceFirst("e", "").replaceFirst("r", "").replaceFirst("o", "");
			list.add(0);
		}
		while (s.contains("w")) {
			s = s.replaceFirst("t", "").replaceFirst("w", "").replaceFirst("o", "");
			list.add(2);
		}
		while (s.contains("u")) {
			s = s.replaceFirst("f", "").replaceFirst("o", "").replaceFirst("u", "").replaceFirst("r", "");
			list.add(4);
		}
		while (s.contains("x")) {
			s = s.replaceFirst("s", "").replaceFirst("i", "").replaceFirst("x", "");
			list.add(6);
		}
		while (s.contains("g")) {
			s = s.replaceFirst("e", "").replaceFirst("i", "").replaceFirst("g", "").replaceFirst("h", "")
					.replaceFirst("t", "");
			list.add(8);
		}

		// 排除5(v f),7(v s)
		while (s.contains("v") && s.contains("f")) {
			s = s.replaceFirst("f", "").replaceFirst("i", "").replaceFirst("v", "").replaceFirst("e", "");
			list.add(5);
		}
		while (s.contains("v") && s.contains("s")) {
			s = s.replaceFirst("s", "").replaceFirst("e", "").replaceFirst("v", "").replaceFirst("e", "")
					.replaceFirst("n", "");
			list.add(7);
		}

		// 排除1(o),3(t) 9(i)
		while (s.contains("o")) {
			s = s.replaceFirst("o", "").replaceFirst("n", "").replaceFirst("e", "");
			list.add(1);
		}
		while (s.contains("t")) {
			s = s.replaceFirst("t", "").replaceFirst("h", "").replaceFirst("r", "").replaceFirst("e", "")
					.replaceFirst("e", "");
			list.add(3);
		}
		while (s.contains("i")) {
			s = s.replaceFirst("n", "").replaceFirst("i", "").replaceFirst("n", "").replaceFirst("e", "");
			list.add(9);
		}

		list.sort((a, b) -> {
			if (a == b)
				return 0;
			if (a > b)
				return 1;
			else
				return -1;
		});
		return list.toString().replaceAll("[,}\\[|\\]| ]", "");
	}

	public String originalDigits(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		// 每个数字出现的次数
		int[] c = new int[10];
		
		c[0] = map.getOrDefault('z',0);
		c[2] = map.getOrDefault('w',0);
		c[4] = map.getOrDefault('u',0);
		c[6] = map.getOrDefault('x',0);
		c[8] = map.getOrDefault('g',0);
		
		c[3] = map.getOrDefault('h',0) - c[8];
		c[5] = map.getOrDefault('f',0) - c[4];
		c[7] = map.getOrDefault('s',0) - c[6];
		
		
		c[1] = map.getOrDefault('o',0) - c[0] - c[2] - c[4];
		c[9] = map.getOrDefault('i',0) - c[6] - c[8] - c[5];
		
		StringBuffer ans = new StringBuffer();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < c[i]; ++j) {
                ans.append((char) (i + '0'));
            }
        }
        return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println(new Solution().originalDigits("fviefuro"));
	}
}