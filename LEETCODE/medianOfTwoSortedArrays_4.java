class medianOfTwoSortedArrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double ans = 0;

    int len1 = nums1.length;
    int len2 = nums2.length;

    int len3 = len1 + len2;

    int merged[] = new int[len3];
    if(len1 != 0){
    System.arraycopy(nums1,0,merged,0,len1);
    }
    if(len2 != 0){
    System.arraycopy(nums2,0,merged,len1,len2);
    }

    Arrays.sort(merged);

    if(len3 == 1){
        return merged[0];
    }
    if(len3 == 2){
        ans = merged[0]+merged[1];
        return ans/2;
    }
    if(len3 % 2 != 0){
        ans = merged[len3/2];
        return ans;
    }
    ans = merged[len3/2]+merged[len3/2-1];


    System.out.println(Arrays.toString(merged));


   
     return ans/2;
    }
}