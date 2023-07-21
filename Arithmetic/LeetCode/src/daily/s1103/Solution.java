package daily.s1103;

/**
 * 1103. ·ÖÌÇ¹û II
 */
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        int candy = 1;
        while (candies > 0) {
            if (candies < candy) {
                ans[i] = ans[i] + candies;
                break;
            }
            ans[i] = ans[i] + candy;
            i = (i + 1) % num_people;
            candies = candies - candy;
            candy++;
        }
        return ans;
    }
}