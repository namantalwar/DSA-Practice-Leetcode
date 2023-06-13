class Solution {
    public int searchInsert(int[] nums, int target) {
        int i =0;
        if(target<=nums[nums.length-1])
        {
            while(nums[i]<target&&i<(nums.length-1))
            {
                i++;
            }
        }
        else
        {
            i = nums.length;
        }
        return(i);
    }
}
