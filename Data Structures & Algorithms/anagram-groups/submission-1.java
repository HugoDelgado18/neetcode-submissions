class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();
    

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            hash.putIfAbsent(sortedS, new ArrayList<>());
            hash.get(sortedS).add(s);
        }

        return new ArrayList<>(hash.values());
    }
}
