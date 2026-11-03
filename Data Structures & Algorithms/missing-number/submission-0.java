class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int sol = 0;
        for(int i=0 ; i<=n ; i++){
            sol ^= i;
        }
        for(int num : nums){
            sol ^= num;
        }

        return sol;
    }
}
