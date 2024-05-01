public class TwoSum {

    public static  void main(String[] args){
        int nums[] = {2,7,11,15};
        int target = 9;
        int[] response = twoSum(nums, target);
        for(int i=0; i< response.length; i++) {
            System.out.print(response[i] +" ");
        }
    }
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }
}
