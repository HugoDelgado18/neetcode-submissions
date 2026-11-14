class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffMap = new HashMap<>();
        diffMap.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++) {
            int diff = target - nums[i];
            // System.out.println(diff);
            // System.out.println(diffMap.keySet());
            // System.out.println(diffMap.get(diff));
            if (diffMap.containsKey(diff)) {

                return new int[] {diffMap.get(diff), i};
            }
            diffMap.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}

/*
Okay we got:
array of int, nums
target int, target
every nums array has two indexes that will sum to target.
Does index order matter..seems it does..

thoughts...
target(7) - nums[i] = diff.
is diff found in hash map?
Yes? HashMap(HM) diff -> index(j)
return array [nums[i], index[j]]
maybe we need to sort? I guess if its already in the HM
then its appeared sooner? So return [index[j], nums[i]]
Maybe we should preload the first index and start at nums[1].
No? Add Diff along with index.

Okay consideration..what happens with duplicate num?
Maybe I need to check for num found and check that index isnt the same. If value is found but index is different than we are okay to proceed as normal..nevermind this wont work we would have duplicate keys that could replace key, value pairs
*/
