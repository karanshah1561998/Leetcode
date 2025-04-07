class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        //runing product
        int rp = 1;
        res[0] = 1;
        //left->right
        for(int i=1; i < n; i++){
            rp = rp*nums[i-1];
            res[i] = rp;
        }
        //right->left
        rp = 1;
        for(int i=n-2; i >= 0; i--){
            rp = rp*nums[i+1];
            res[i] = res[i]*rp;
        }
        return res;
    }
}