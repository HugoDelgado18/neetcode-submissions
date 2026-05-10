      /*
            okay checklist for prove its and anagram
            1. size is the same character length
            2. both strings have the same letters
            3. each character should be present in the string the same amount

            we already checked string length off rip.
        
            but how should we go about checking character and comparing them 
            And checking character count

            my first thought is to place the string into a hashtable where the index
            is the count and the value is the string
            > we could do the same for the second string 
            then we would just need to compare the index and values of both hashTables.

            lots of loops here wondering if there is a faster way and more efficient.

            

        */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Hashtable<Character, Integer> sHash = new Hashtable<>();
        Hashtable<Character, Integer> tHash = new Hashtable<>();


        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (sHash.containsKey(letter)) {
                int value = sHash.get(letter);
                sHash.put(letter, value + 1);
            } else {
                sHash.put(letter, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);
            if (tHash.containsKey(letter)) {
                int value = tHash.get(letter);
                tHash.put(letter, value + 1);
            } else {
                tHash.put(letter, 1);
            }
        }

        if (sHash.equals(tHash)) {
            return true;
        } else {
            return false;
        }
    }
}
