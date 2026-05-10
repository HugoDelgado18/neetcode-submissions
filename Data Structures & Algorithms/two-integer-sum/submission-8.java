class Solution {


    public int[] twoSum(int[] nums, int target) {
        // add all nums into a hash
        HashMap<Integer, Integer> hash = new HashMap<>();

        int count =  -1;
        for (int num : nums) {
            count++;
            hash.put(num, count);
        }
        System.out.println(hash);

        for (int i = 0; i < nums.length; i ++) {
            Integer targetNum = target - nums[i];

            if (hash.get(targetNum) != null && i != hash.get(targetNum)) {
                return new int[]{i, hash.get(targetNum)};
            }
        }
        return new int[0];
    } 



}

   
        // for (int i = 0; i < nums.length; i++) {

        //     for (int j = i + 1; j < nums.length; j++) {
        //         int sum = nums[i] + nums[j];
        //         if (sum == target)  {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[0];