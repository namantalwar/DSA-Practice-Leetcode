class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {

            for(int j = 0;j<nums[i].length;j++)
            {
                if(map.containsKey(nums[i][j]))
                {
                    map.put(nums[i][j],map.get(nums[i][j])+1);
                }  
                else
                {
                    map.put(nums[i][j],1);
                }
            }
        }

        for(int key:map.keySet())
        {
            if(map.get(key)==nums.length)
            {
                a.add(key);
            }
        }
        Collections.sort(a);
        return a;
    }
}
