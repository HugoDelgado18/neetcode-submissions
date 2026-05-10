class Solution {
    public boolean isPalindrome(String s) {
        // 2 pointer solution
        // so we should remove space and ignore special characters and set to lowercase

        String sRefactored = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = sRefactored.length() - 1;
        while (left < right) {
            if (sRefactored.charAt(left) != sRefactored.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
