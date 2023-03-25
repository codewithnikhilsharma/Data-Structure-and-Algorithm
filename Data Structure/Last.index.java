public int lengthOfLastWord(String s) {
    // Trim any trailing and leading spaces from the string
    s = s.trim();
    
    // Find the last space in the string
    int lastSpaceIndex = s.lastIndexOf(' ');
    
    // If there are no spaces in the string, return the length of the whole string
    if (lastSpaceIndex == -1) {
        return s.length();
    }
    
    // Otherwise, return the length of the substring after the last space
    return s.length() - lastSpaceIndex - 1;
}
