class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int sol[] = new int[2];
        for(int i = 0;i<nums.length-1;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                sum = nums[i]+nums[j];
                if(sum==target)
                {
                    sol[0] = i;
                    sol[1] = j;
                
                }
            }
        }
        return(sol);
    }
}
