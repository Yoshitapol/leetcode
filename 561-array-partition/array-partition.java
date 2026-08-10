class Solution {
    public int arrayPairSum(int[] nums) {
        int i,sum = 0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i+=2){
            sum += nums[i];
        }
        return sum;
    }
}