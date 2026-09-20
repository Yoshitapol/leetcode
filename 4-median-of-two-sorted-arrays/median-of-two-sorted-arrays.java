class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m,n,i=0,j=0,k=0;
        double median;
        m=nums1.length;
        n=nums2.length;
        int[] nums3=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                nums3[k++]=nums1[i];
                i++;
            }
            else{
                nums3[k++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            nums3[k++]=nums1[i];
            i++;
        }
        while(j<n){
            nums3[k++]=nums2[j];
            j++;
        }
        if((m+n)%2==0)
            median=(nums3[(m+n)/2]+nums3[((m+n)/2)-1])/2.0;
        else 
            median=nums3[(m+n)/2];
        return median;
    }
}