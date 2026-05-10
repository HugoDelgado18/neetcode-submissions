class Solution {
    public boolean isPalindrome(String s) {
        // 2 pointer solution
        // so we should remove space and ignore special characters
        // if (s.length() < 3) {
        //     return false;
        // }

        String sRefactored = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < sRefactored.length() / 2; i++) {
            System.out.println(sRefactored.charAt(i));
            System.out.println(sRefactored.charAt(sRefactored.length() - 1 - i));
            if (sRefactored.charAt(i) != sRefactored.charAt(sRefactored.length() - 1 - i)) {
                return false;
            }

        }

        

        // int left = 0;
        // int right = sRefactored.length();
        // while (left < right) {
        //     System.out.println(sRefactored.charAt())
        // }
        return true;
    }
}
