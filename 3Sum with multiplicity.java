class Solution {
    public int threeSumMulti(int[] nums, int target) {
        Arrays.sort(nums);
        long c=0;
        for(int i = 0;i<nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;
            int sum = target-nums[i];
            while(left<right)
            {
                if(sum==nums[left]+nums[right])
                {
                    int c1 = 1,c2=1;
                    if(nums[left]==nums[right])
                    {
                        int len = right-left+1;
                        c = c+(len*(len-1)/2);
                        break;
                    }
                    while(left<right&&nums[left]==nums[left+1])
                    {
                        c1++;
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right-1])
                    {
                        c2++;
                        right--;
                    }
                    c = c+(c1*c2);
                    left++;
                    right--;
                }
                else if(sum>nums[left]+nums[right])
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return (int)(c%1000000007);
    }
}
