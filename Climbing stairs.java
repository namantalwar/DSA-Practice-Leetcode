class Solution {
    public int climbStairs(int n) {
        int ans=0;
        
        if(n==2)
        {
            ans = 2;   
        }
        else if(n==1)
        {
            ans = 1;
        }
        else
        {
            int[] a = new int[n];
            a[0] = 1;
            a[1] =2;
            for(int i =2;i<n;i++)
            {
                a[i] = a[i-1]+a[i-2];
            }
            ans = a[n-1];
        }
        return ans; 
    }
}
