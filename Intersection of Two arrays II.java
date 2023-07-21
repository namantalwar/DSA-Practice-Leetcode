class Solution {
    public int minfrequency(int[] nums1,int[] nums2 ,int n)
    {
        int c1=0;
        int c2 =0;
        for(int i =0;i<nums1.length;i++)
        {
            if(nums1[i]==n)
            {
                c1++;
            }
        }
        for(int i =0;i<nums2.length;i++)
        {
            if(nums2[i]==n)
            {
                c2++;
            }
        }
        return(Math.min(c1,c2));

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else
            {
                map.put(nums1[i],1);
            }
        }
        for(int i =0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                map.put(nums2[i],map.get(nums2[i])+1);
            }
            else
            {
                map.put(nums2[i],1);
            }
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>1)
            {
                for(int j = 0;j<minfrequency(nums1,nums2,key);j++)
                {
                    a.add(key);
                }
            }
        }

        int ans[]= new int[a.size()];
        for(int i =0;i<a.size();i++)
        {
            ans[i] = a.get(i);
        }
        return ans;
    }
}
