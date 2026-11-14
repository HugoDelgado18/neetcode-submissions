class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> found = new HashSet<Integer>();

        for (int num : nums) {
            if (found.contains(num)) {
                return true;
            }
            found.add(num);
        }
        return false;
        
    }
}

/*
brute force nested for loop check every int against all following for duplicate return true when found if not return false..
next is for loop.. enter in hashmap if not found if it is found return false.
*/ 