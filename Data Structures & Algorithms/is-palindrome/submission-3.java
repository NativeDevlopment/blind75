class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphanumeric = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                alphanumeric.append(s.charAt(i));
            }
        }

        int l = 0;
        int r = alphanumeric.length() - 1;

        while (l < r) {
            if (Character.toLowerCase(alphanumeric.charAt(l)) !=
                Character.toLowerCase(alphanumeric.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}