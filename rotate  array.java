class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if(k>=l)
        {
            k = k%l;
        }
        int a[] = new int[l];
        for(int i =0;i<l;i++)
        {
            a[i] = nums[i];
        }
        int j = 0;
        for(int i = l-k;i<l;i++)
        {
            nums[j++] = a[i];
        }
        for(int i = 0;i<l-k;i++)
        {
            nums[j++] = a[i];
        }
    }
}
