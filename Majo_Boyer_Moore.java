
public class Majo_Boyer_Moore {

    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) count++;
            else count--;
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }
        return count > nums.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
