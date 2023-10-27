class Solution {
     int maxLen = 0;
     int si = 0;

    public String longestPalindrome(String s) {
            char[] cArr = s.toCharArray();
            if (s.length() < 2) {
                return s;
            }

            for (int i = 0; i < cArr.length; i++) {
                check(cArr, i, i);
                check(cArr, i, i + 1);
            }
            return s.substring(si, si + maxLen);
        }

        public void check(char[] s, int i, int j) {
            while (i >= 0 && j < s.length && s[i] == s[j]) {
                i--;
                j++;
            }
            if (maxLen < j - i - 1) {
                maxLen = j - i - 1;
                si = i + 1;
            }
        }

}
