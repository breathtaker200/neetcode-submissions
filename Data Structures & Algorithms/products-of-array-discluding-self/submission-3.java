class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int c = 0;
        int z = 0;
        for (int n : nums) {
            if (n != 0) {
                c++;
                prod *= n;
            }else{
                z++;
            }
        }

        if (c == 0) {
            return nums;
        }

        if(z >= 2){
            int[] a = new int[nums.length];
            return a;
        }

        for (int i = 0; i < nums.length; i++) {
            if (c != nums.length) {
                if (nums[i] != 0) {
                    nums[i] = 0;
                } else {
                    nums[i] = prod;
                }
            }else{
                nums[i] = prod / nums[i];
            }
        }
        return nums;
    }
}
