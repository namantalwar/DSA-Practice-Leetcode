class Solution {
    public int reverse(int x) {
        String st = Integer.toString(x);
        if(st.charAt(0)=='-')
        {
            String st2 = st.substring(1);
            StringBuilder st1 = new StringBuilder();
            st1.append(st2);
            st1.reverse();
            st = '-'+st1.toString();
            long ans = Long.valueOf(st);
            if(ans<Math.pow(-2,31) || ans>Math.pow(2,31) )
                return 0;
            else 
                return (int)ans;
        }
        StringBuilder st1 = new StringBuilder();
        st1.append(st);
        st1.reverse();
        st = st1.toString();
        long ans = Long.valueOf(st);
        if(ans<Math.pow(-2,31) || ans>Math.pow(2,31) )
            return 0;
        else 
            return (int)ans;
    }
}
