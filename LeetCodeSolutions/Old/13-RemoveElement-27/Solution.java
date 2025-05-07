class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != val) {
                int temp = nums[j]; // not needed
                nums[j] = nums[i]; // main line
                nums[i] = temp; // not needed
                j++;
            }
        }
        return j;
    }
}
