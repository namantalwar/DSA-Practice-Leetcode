class Solution {
    public boolean isPalindrome(int x) {
        String st = Integer.toString(x);
        boolean a = false;
        int l = st.length();
        String st2= "";
        for(int i =l-1;i>=0;i--)
        {
            st2 = st2+st.charAt(i);
        }
        if(st.compareTo(st2)==0)
        {
            a= true;
        }
        return a;
    }
}
