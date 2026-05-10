class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            if (hash.contains(num)) {
                return true;
            } else {
                hash.add(num);
            }
        }
        return false;
    }
}
