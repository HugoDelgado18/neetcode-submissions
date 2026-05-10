/*
    checklist
    1.array size isnt 0
    is it sorted? seems to be sorted. we can use this.
    2. brute force we could use a nested for loop to cycle through the array and 
    check if they are equal to the target value

    whats a better solution?
    we could start at the end and check if the last number is higher than the target

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[0];
    }
}
