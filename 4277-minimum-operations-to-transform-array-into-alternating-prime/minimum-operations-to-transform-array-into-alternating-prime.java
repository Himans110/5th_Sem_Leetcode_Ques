class Solution {
    public int minOperations(int[] nums) {
        int step = 0;

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                if(!prime(nums[i])){
                    int num = nums[i];
                    while(!prime(num)){
                        step++;
                        num++;
                    }
                }
            }
            else{
                if(prime(nums[i])){
                    int num = nums[i];
                    while(prime(num)){
                        step++;
                        num++;
                    }
                }
            }
        }
        return step;
    }

    public boolean prime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}