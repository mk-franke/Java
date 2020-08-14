package com.telran;

public class SubsequenceFinder {

    public boolean isSubsequence(String text, String pattern) {
        return isSubsequenceRec(text, pattern, text.length(), pattern.length());
    }

    private boolean isSubsequenceRec(String text, String pattern, int textLength, int patternLength) {
        // if the current length of the text is smaller than the current length of the pattern ,
        // therefore the pattern cannot be a subsequence of the text
        if (patternLength > textLength)
            return false;
        if (patternLength == 0)
            return true;
        if (pattern.charAt(patternLength - 1) == text.charAt(textLength - 1))
            return isSubsequenceRec(text, pattern, textLength-1, patternLength-1);
        return isSubsequenceRec(text, pattern, textLength-1, patternLength);
    }

}
