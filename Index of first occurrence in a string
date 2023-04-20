class Solution {
    public int strStr(String haystack, String needle) {
        int l = haystack.length();
        int l1 = needle.length();
        int c = -1;
        for(int i = 0;i<=(l-l1);i++)
        {
            int j =0;
            while(j<l1 && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
            }
            if(j==l1)
            {
                return i;
            }
        }
        return -1;
    }
}
