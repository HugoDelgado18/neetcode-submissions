class Solution {
    public int longestConsecutive(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        HashSet<Integer> seen = new HashSet<Integer>();
        int maxCount = 0;
        int left = 0; int right = 1;

        if (nums.length == 1) return 1;

        while (left < nums.length - 1) {
            seen.clear();
            while (right < sortedNums.length) {
                if (sortedNums[left] == sortedNums[right] - 1 || sortedNums[left] == sortedNums[right]) {
                    if (seen.size() == 0) {
                        seen.add(sortedNums[left]);
                    }
                    if (sortedNums[left] != sortedNums[right]) {
                        seen.add(sortedNums[right]);
                    }
                    left++;
                    right++;
                } else {
                    break;
                }


            }
            maxCount = Math.max(maxCount, seen.size());
            left++;
            right++;
        }
        if (maxCount == 0 && nums.length > 1) return 1;
        return maxCount;
    }
}
