import java.util.Arrays;

public class Contains_Duplicate {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
  /*      int[] new_nums = new int[nums.length - 1];
        System.arraycopy(nums, 1, new_nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(new_nums));

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] != nums[nums.length - 1]) {
                return containsDuplicate(new_nums);
            } else {
                return true;
            }
        }
        return false;*/
    }

    public static void main(String[] args) {

        boolean result = new Contains_Duplicate().containsDuplicate(new int[] {1, 4, 2, 5});
        System.out.println(result);

    }

}
