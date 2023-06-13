class Solution {
    public boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String s1 = String.valueOf(a);
        String t1 = String.valueOf(b);
        return(s1.compareTo(t1)==0);
    }
}
