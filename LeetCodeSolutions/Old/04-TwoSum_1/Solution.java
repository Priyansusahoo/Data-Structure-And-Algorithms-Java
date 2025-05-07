class Solution {
    //method - 1
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    //method - 2
    /**
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i< nums.length; i++) {
            for (int j = i+1; j< nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    // return new int[] {i, j};
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }
    */
}
