package s2383;

/**
 * 2383. 赢得比赛需要的最少训练时长
 */
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energySum = 0;
        for (int e : energy) {
            energySum += e;
        }
        int trainingHours = initialEnergy > energySum ? 0 : (energySum - initialEnergy) + 1;

        for (int e : experience) {
            if (initialExperience <= e) {
                trainingHours += 1 + (e - initialExperience);
                initialExperience = 2 * e + 1;
            } else {
                initialExperience += e;
            }
        }

        return trainingHours;
    }

}
