class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }

        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i] , map.get(nums[i]) - 1);
            if(i>0 && nums[i] == nums[i-1]) continue;
            
            for(int j=i+1 ; j<nums.length ; j++){
                map.put(nums[j] , map.get(nums[j]) -  1);
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int val = -(nums[i] + nums[j]);
                if(map.getOrDefault(val , 0) > 0){
                    list.add(Arrays.asList(nums[i] , nums[j] , val));
                }
            }
            for(int j=i+1 ; j<nums.length ; j++){
                map.put(nums[j] , map.getOrDefault(nums[j] , 0) + 1);
            }
        }
        return list;
    }
}
