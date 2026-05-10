class Solution {
    public boolean isPalindrome(String s) {
        // 2 pointer solution
        // so we should remove space and ignore special characters and set to lowercase

        String sRefactored = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < sRefactored.length() / 2; i++) {
            // System.out.println(sRefactored.charAt(i));
            // System.out.println(sRefactored.charAt(sRefactored.length() - 1 - i));
            if (sRefactored.charAt(i) != sRefactored.charAt(sRefactored.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
