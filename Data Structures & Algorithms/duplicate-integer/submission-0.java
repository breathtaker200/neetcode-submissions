class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> c = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(c.contains(nums[i])){
                return true;
            }else{
                c.add(nums[i]);
            }
        }
        return false;
    }
}