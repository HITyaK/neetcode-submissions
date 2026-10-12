class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int sol[] = new int[n];
        Set<Character> set = Set.of('a' , 'e' , 'i' , 'o' , 'u');
        for(int i=0 ; i<n ; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int count = 0;
            for(int j=start ; j<=end ; j++){
                if(set.contains(words[j].charAt(0)) && set.contains(words[j].charAt(words[j].length() - 1))){
                    count++;
                }
            }
            sol[i]=count;
        }
        return sol;
    }
}