import java.util.Arrays;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //brute force
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};
    }
    public static void main(String[] args) {
	    System.out.print( Arrays.toString( twoSum(new int [] {3,2,4},6)) );
    }
}
