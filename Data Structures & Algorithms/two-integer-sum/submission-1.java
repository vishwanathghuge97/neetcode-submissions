class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); //its like db

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];//complement which num to find but in question we required index

            if (seen.containsKey(complement)) {
                int j = seen.get(complement);
                return new int[]{j, i}; 
            }

            seen.put(nums[i], i); //key= actual value, value= index
        }

        return new int[]{}; 
    }
}