class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int k=1;
        int temp = nums[0];
        for(int i = 1;i<l;i++)
        {
            if(nums[i]!=temp)
            {
                temp = nums[i];
                int temp1 = nums[k];
                nums[k] = nums[i];
                nums[i] = temp1;
                k++;
            }
        }
        return k;
    }
}
