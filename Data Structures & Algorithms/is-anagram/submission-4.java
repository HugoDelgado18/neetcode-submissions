class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        String sorted1 = new String(array1);
        String sorted2 = new String(array2);

        if (sorted1.equals(sorted2)) {
            return true;
        }

    return false;
    }
}

/*
We get 2 strings.
what makes a valid anagram?
    same length
    same letters
    same amount of each letter
    order doesnt matter

we could organize both strings then they would be identical? We wouldnt have to check letter count..?

fail fast check both string lengths?
*/
