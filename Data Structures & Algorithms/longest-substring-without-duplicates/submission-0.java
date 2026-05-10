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
                System.out.println("removed array: ");
                System.out.println(seq);
            } 

            seq.add(currChar);
            System.out.println("added array: ");
            System.out.println(seq);
            largestConsec = Math.max(largestConsec, r - l + 1);
 
            r++;
        }

        // System.out.println(seq);

        return largestConsec;
    }
}
