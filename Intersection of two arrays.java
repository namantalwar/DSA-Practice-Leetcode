class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
    
        for(int i = 0;i<nums1.length;i++)
        {
            map.put(nums1[i],1);
        }

        for(int i = 0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                map.put(nums2[i],map.get(nums2[i])+1);
            }
        }

        ArrayList<Integer> a = new ArrayList<>(); 
        for(int key:map.keySet())
        {
            if(map.get(key)>1)
            {
                a.add(key);
            }
        }
        int n = a.size();
        int[] ans = new int[n];
        for(int i = 0;i<n;i++)
        {
            ans[i] = a.get(i);
        }
        return ans;
    }
}
