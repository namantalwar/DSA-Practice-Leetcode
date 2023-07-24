class Solution {
    public int expandfromMiddle(String s,int left,int right)
    {
        if(left>right&&s==null)
        {
            return 0;
        }
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        if(s.length()<1||s==null)
        {
            return "";
        }
        for(int i = 0;i<s.length();i++)
        {
            int l1= expandfromMiddle(s,i,i);
            int l2 = expandfromMiddle(s,i,i+1);
            int l = Math.max(l1,l2);
            if(l>end-start)
            {
                start = i-((l-1)/2);
                end = i+(l/2);
            }
        }
        return s.substring(start,end+1);
    }
}
