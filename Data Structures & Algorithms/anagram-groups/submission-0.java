class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

        for(String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortStr = new String(arr);
            map.putIfAbsent(sortStr , new ArrayList<>());
            map.get(sortStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
