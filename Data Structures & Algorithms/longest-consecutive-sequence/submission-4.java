class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }

        int sol = 0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int count = 0, cur = num;
                while(set.contains(cur)){
                    count++;
                    cur++;
                }
                sol = Math.max(sol , count);
            }
        }

        return sol;
    }
}
