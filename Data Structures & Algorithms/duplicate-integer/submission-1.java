class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hasNum = new HashSet<Integer>();

        for (int num : nums) {
            System.out.println(num);
            if (hasNum.contains(num)) {
                return true;
            }
            hasNum.add(num);
        }
    return false;
    }
}