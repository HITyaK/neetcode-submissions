class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        int zeroC = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != 0){
                prod *= nums[i];
            }
            else{
                zeroC++;
            }
        }
        if(zeroC > 1){
            return new int[nums.length];
        }

        for(int i=0 ; i<nums.length ; i++){
            if(zeroC > 0){
                res[i] = nums[i] == 0? prod : 0;
            }
            else{
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
