class Solution {
    public int longestConsecutive(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        HashSet<Integer> seen = new HashSet<Integer>();
        int maxCount = 0;
        int left = 0; int right = 1;

        if (nums.length == 1) return 1;

        while (left < nums.length - 1) {
            seen.clear();
            // System.out.println("left: " + sortedNums[left] + " right: " + (sortedNums[right] - 1));
            // System.out.println(sortedNums[left] == sortedNums[right] - 1);
            // System.out.println(sortedNums[left] == sortedNums[right]);
            // System.out.println((sortedNums[left] == sortedNums[right] - 1 || sortedNums[left] == sortedNums[right]));
            
            while (right < sortedNums.length) {
                // System.out.println("right: " + right + " length: " + sortedNums.length);
                if (sortedNums[left] == sortedNums[right] - 1 || sortedNums[left] == sortedNums[right]) {
                    System.out.println("left :" + sortedNums[left]);
                    System.out.println("right :" + sortedNums[right]);
                    if (seen.size() == 0) {
                        seen.add(sortedNums[left]);
                        System.out.println(seen);
                    }
                    if (sortedNums[left] != sortedNums[right]) {
                        System.out.println("right num: " +sortedNums[right]);
                        seen.add(sortedNums[right]);
                        System.out.println(seen);
                    }
                    left++;
                    right++;
                } else {
                    break;
                }


            }
            System.out.println("left :" + sortedNums[left]);
            // System.out.println("right :" + sortedNums[right]);
            System.out.println("right: " + right + " length: " + sortedNums.length);
            System.out.println(right < sortedNums.length - 1);
            maxCount = Math.max(maxCount, seen.size());
            System.out.println(maxCount);
            left++;
            right++;
        }
        if (maxCount == 0 && nums.length > 1) return 1;
        return maxCount;
    }
}
