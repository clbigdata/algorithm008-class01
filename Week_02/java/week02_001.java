public class week02_001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new RuntimeException("No two sum solution");

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        week02_001 week02_001 = new week02_001();
        week02_001.twoSum(nums,9);
    }
}
