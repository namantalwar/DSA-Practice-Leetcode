class Solution {
    public boolean isFascinating(int n) {
        int x = n*2;
        int y = n*3;
        String c = n+""+x+""+y;
        char arr[] = c.toCharArray();
        Arrays.sort(arr);
        String d= new String(arr);
        return(d.compareTo("123456789")==0);
    }
}
