class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length - 1;
        int [] sol = new int[2];
        while(left<right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                sol[0]=left+1;
                sol[1]=right+1;
                break;
            }
            else if (sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return sol;
    }
}
