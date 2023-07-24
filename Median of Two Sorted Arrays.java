class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[] = new int[nums1.length+nums2.length];
        int k = 0;
        for(int i =0;i<nums1.length;i++)
        {
            a[k++] = nums1[i];
        }
        for(int i = 0;i<nums2.length;i++){
            a[k++] = nums2[i];
        }
        Arrays.sort(a);
        int mid = a.length/2;
        if(a.length%2==0)
        {
            return (double)(a[mid-1]+a[mid])/2;
        }
        return a[mid];
    }
}
