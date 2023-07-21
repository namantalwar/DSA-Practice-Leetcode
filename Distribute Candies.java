class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> h=new HashSet<>();
        for(int i: candyType){
            h.add(i);
        }
        if(candyType.length/2 > h.size()) return  h.size();
        else return candyType.length/2;
    }
}
