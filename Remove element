class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        int j = 0;
        for(int i = 0;i<l;i++)
        {
            if(nums[i]!=val)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j;
    }
}
