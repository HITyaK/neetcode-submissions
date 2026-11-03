class Solution {
    public int[] countBits(int n) {
        int [] arr = new int[n+1];
        for(int i=1 ; i<=n ; i++){
            int num = i;
            while(num !=0){
                arr[i]++;
                num = num & (num -1);
            }
        }
        return arr;
    }
}
