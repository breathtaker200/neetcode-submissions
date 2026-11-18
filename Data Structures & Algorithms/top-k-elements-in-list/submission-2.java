// This problem uses Bucket Sort
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] ans = new int[k];
        int c = 0;
        for (int i = bucket.length - 1; i >= 0 && c < k; i--) {
            if (bucket[i] != null) {
                for (Integer integer : bucket[i]) {
                    ans[c++] = integer;
                }
            }
        }
        return ans;
    }
}
