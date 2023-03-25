class Solution {
    public int repeatedStringMatch(String A, String B) {
        if(A==null || B==null)
            return -1;
        int[] pref = longPrefSub(B);
        StringBuilder temp = new StringBuilder();
        int count = 0;
        while(temp.length()<B.length()){
            temp.append(A);
            count++;
        }
        if(isFound(temp.toString(), B, pref))
            return count;
        if(isFound(temp.append(A).toString(), B, pref))
            return count+1;
        return -1;
    }
    
    private int[] longPrefSub(String word) {
        int[] pattern = new int[word.length()];
        Arrays.fill(pattern, -1);
        int i = 1, j = 0;
        while (i < word.length()) {
            if (word.charAt(i) == word.charAt(j)) {
                pattern[i] = j;
                i++;
                j++;
            } else if (j > 0) {
                j = pattern[j - 1] + 1;
            } else {
                i++;
            }
        }
        return pattern;
    }
    private boolean isFound(String string, String substring, int[] pattern) {
        int i = 0, j = 0;
        while (i + substring.length() - j <= string.length()) {
            if (string.charAt(i) == substring.charAt(j)) {
                if (j == substring.length() - 1) {
                    return true;
                }
                i++;
                j++;
            } else if (j > 0) {
                j = pattern[j - 1] + 1;
            } else {
                i++;
            }
        }
        return false;
    }
}
