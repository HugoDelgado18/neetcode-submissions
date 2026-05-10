class Solution {
    public int lengthOfLongestSubstring(String s) {
        int largestConsec = 0;
        int l = 0;
        int r = 0;
        Set<Character> seq = new HashSet<Character>();
        while (l <= r && r < s.length()) {
            char currChar = s.charAt(r);
            while(seq.contains(currChar)) {
                char startChar = s.charAt(l);
                seq.remove(startChar);
                l++;
            }
            seq.add(currChar);
            largestConsec = Math.max(largestConsec, r - l + 1);
            r++;
        }
        return largestConsec;
    }
}
