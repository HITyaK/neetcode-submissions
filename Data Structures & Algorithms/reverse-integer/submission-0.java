class Solution {
    public int reverse(int x) {
        int min = -2147483648;
        int max = 2147483647;

        int res = 0;
        while(x != 0){
            int rem = x%10;
            x /= 10;
            if(res > max/10 || (res == max && rem > max%10)){
                return 0;
            }
            if(res <min/10 || (res== min && rem < min%10)){
                return 0;
            }

            res = (res * 10) + rem;
        }
        return res;
    }
}
