class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l = s.length();
        String st2 = "",st3 = "";
        for(int i = 0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch)||Character.isDigit(ch))
            {
                st2=st2+ch;
                st3 = ch+st3;
            }
        }
        if(st2.compareTo(st3)==0)
        {
            return true;
        }

        return false;

    }
}
