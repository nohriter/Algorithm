package leetcode;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4};
        int target = 6;

        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        return output;
    }
}
