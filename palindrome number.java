class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder st1 = new StringBuilder();
        st1.append(s);
        st1.reverse();
        String st = st1.toString();
        return (st.compareTo(s)==0);
    }
}
