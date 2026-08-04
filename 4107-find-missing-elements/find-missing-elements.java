class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0,min = 0,k=0,n,i;
        Arrays.sort(nums);
        max = nums[nums.length-1];
        min = nums[0];
        List<Integer> result = new ArrayList<>();
        n = min;
        for(i=0;i<nums.length;i++){
            while (n < nums[i]) {
                result.add(n);
                n++;
            }
            n = nums[i] + 1;
        }
        return result;
    }
}